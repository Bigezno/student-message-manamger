package controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pojo.Manamger;
import validator.ValidatorGroup1;

@Controller
@RequestMapping("/manamger")
public class ManamgerController {
	
	
	@RequestMapping(value="/login.do",method=RequestMethod.GET)
	public ModelAndView loginGet() {
		ModelAndView mav = new ModelAndView("manamger/loginManamger");
		mav.addObject("manamger", new Manamger());
		return mav;
	}
	
	@RequestMapping(value="/login.do",method=RequestMethod.POST)
	public String loginPost(@ModelAttribute("manamger") @Validated(value={ValidatorGroup1.class}) Manamger manamger,BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "manamger/loginManamger";
		}
		
		
		return "message/manamger";  //跳到管理信息界面
	}
	
	
}
