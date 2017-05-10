package controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pojo.SelectStudent;
import pojo.Student;
import service.SelectStudentService;

@Controller
@RequestMapping("selectstudent")
public class SelectStudentController {
	
	@Autowired
	private SelectStudentService selectStudentService;
	
	@RequestMapping(value="/student.do",method=RequestMethod.POST) //测试时简单为get，实际上要POST,因为该信息不能直接暴露
	public ModelAndView getCourseMessage(HttpServletRequest request,HttpSession session) {
		SelectStudent selectStudent = new SelectStudent(); 
		
		int s_id = ((Student)session.getAttribute("student")).getId();
		selectStudent.setS_id(s_id);
		
		String [] courseIDs = request.getParameterValues("select_course"); //获取表单中所选课程的id
		if(courseIDs==null||courseIDs.length==0) { //如果课程未选，则跳回
			ModelAndView mav = new ModelAndView("selectcourse"); 
			return mav;
		}
		
		for(String course_id:courseIDs) {
			int id = Integer.parseInt(course_id);
			selectStudent.setSelect_course_id(id);
			selectStudentService.saveSelectStudent(selectStudent);
		}
		
		
		ModelAndView mav = new ModelAndView("message/student");
		return mav;
	}
	
}
