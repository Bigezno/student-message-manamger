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

import pojo.Student;
import service.StudentService;
import validator.ValidatorGroup1;

@Controller
@RequestMapping("/student")
public class StudentController {
	// 注入studentService 对象  
    @Autowired  
    private StudentService studentService;
	
    
    //在所有功能处理方法之前在模型数据中绑定一个student对象
    @ModelAttribute(value = "student")
    public Student student() {
       return new Student();
    }
    
    @RequestMapping(value="/login.do",method=RequestMethod.GET)
    public String loginStudentGet() {
    	return "student/loginStudent";  //跳转到loginStudent.jsp页面去登录
    }
    
    @RequestMapping(value="/login.do",method=RequestMethod.POST)
    public String loginStudentPost(HttpServletRequest request,Model model) {
    	//1.先检测 图片验证码,而不是去检测表单数据，因为检测数据要操作数据库，造成时间开销
    	String validateCode = request.getParameter("validateCode");
    	String checkcode = (String) request.getSession().getAttribute("checkcode");
    	
    	if(validateCode.equals("")||!checkcode.equalsIgnoreCase(validateCode)){  //如果验证码不对，则显示错误
			request.setAttribute("message", "验证码输入错误");
			return "student/loginStudent";
		}
    	
    	String idString = request.getParameter("id");
    	String password = request.getParameter("password");
    	
    	if(idString==null||idString.equals("")) {
    		request.setAttribute("IdOrPwdError", "学号不能为空");
    		return "student/loginStudent";
    	} else {
    		int id = Integer.parseInt(idString);
    		Student student = studentService.getStudent(id);
    		
    		if(student!=null&&student.getPassword().equals(password)) {
    			model.addAttribute("student", student);
    			return "message/student";  //跳到学生信息页面
    		}
    	}
    	
    	request.setAttribute("IdOrPwdError", "学号或密码输入错误");
    	return "student/loginStudent";  
    }
    
    
    @RequestMapping("/register.do")
    public String registerStudent() {
    	return "student/registerStudent";  //跳转到registerStudent.jsp页面去注册
    }
    
    //1.绑定注册页面表单传递上来的数据，进行数据类型转换，验证，然后格式化输出
    @RequestMapping(value="/save.do",method=RequestMethod.POST)
	public String saveStudent(@ModelAttribute("student") @Validated(value={ValidatorGroup1.class}) Student student,BindingResult bindingResult){
		System.out.println(student);
		
		//1.验证参数输入是否正确,错误则跳回注册界面，同时使用errors标签回显错误信息
		if (bindingResult.hasErrors()) {
	         return "student/registerStudent";
	    }
		
		//1.保存学生信息到数据库中
		studentService.saveStudent(student);
		
		return "message/student";  //跳到学生信息页面
	}
    
}
