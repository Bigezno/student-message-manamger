package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pojo.Teacher;
import service.TeacherService;
import validator.ValidatorGroup1;

@Controller
@RequestMapping("/teacher")
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;
	
	
	
	@RequestMapping(value="/login.do",method=RequestMethod.GET)
	public String loginGet(@ModelAttribute("teacher") Teacher teacher) {
		
		return "teacher/loginTeacher";
	}
	
	@RequestMapping(value="/login.do",method=RequestMethod.POST)
	public String loginPost( HttpServletRequest request,Model model) {
		
		Teacher teacher = null;
		String idString = request.getParameter("id");
		String password = request.getParameter("password");
		if(idString!=null&&!idString.equals("")) {
			int id  = Integer.parseInt(idString);
			teacher = teacherService.getTeacher(id);
			if(password.equals(teacher.getPassword())) {
				model.addAttribute("teacher", teacher);
				System.out.println("到这里了");
    			return "message/teacher";  //跳到老师信息页面
			}
		}
		
		request.setAttribute("IdOrPwdError", "编号或密码输入错误");
		return "teacher/loginTeacher";  //重新登录
	}
	
	
	
	@RequestMapping(value="/register.do",method=RequestMethod.GET)
	public String registerGet(@ModelAttribute("teacher") Teacher teacher) {
		return "teacher/registerTeacher";
	}
	
	
	@RequestMapping(value="/register.do",method=RequestMethod.POST)
	public String registerPost(@ModelAttribute("teacher") @Validated(value={ValidatorGroup1.class}) Teacher teacher,BindingResult bindingResult) {
														//表示只校验有该分组的字段，ValidatorGroup1单纯用于分组标记的接口
		if(bindingResult.hasErrors()) {
			return "teacher/registerTeacher";
		}
		
		teacherService.saveTeacher(teacher);
		
		
		return "message/teacher";  //跳到管理信息界面
	}
	
}
