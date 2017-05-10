package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pojo.Course;
import service.CourseService;

@Controller
@RequestMapping("course")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping(value="/course.do",method=RequestMethod.GET) //测试时简单为get，实际上要POST,因为该信息不能直接暴露
	public ModelAndView getCourseMessage(int id) {
		Course course = courseService.getCourse(id);
		System.out.println(course);
		ModelAndView mav = new ModelAndView("message/course");
		mav.addObject("course", course);
		return mav;
	}
	
}
