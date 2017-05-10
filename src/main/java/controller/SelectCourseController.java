package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pojo.SelectCourse;
import service.SelectCourseService;

@Controller
@RequestMapping("selectcourse")
public class SelectCourseController {
	
	@Autowired
	private SelectCourseService selectCourseService;
	
	@RequestMapping(value="/course.do",method=RequestMethod.GET) //测试时简单为get，实际上要POST,因为该信息不能直接暴露
	public ModelAndView getCourseMessage() {
		
		List<SelectCourse> listCourse =  selectCourseService.getCourseMessage();
		for(SelectCourse selectCourse:listCourse) {
			System.out.println(selectCourse);
		}
		System.out.println();
		ModelAndView mav = new ModelAndView("selectcourse");
		mav.addObject("selectCourse",listCourse);
		return mav;
	}
	
}
