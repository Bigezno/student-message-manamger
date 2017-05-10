package exception.resolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import exception.StudentException;

//首先定义一个全局异常类,可以看出这个类会把异常打印在控制台,并且放入model中,以便可以在jsp页面上展示出来
public class MyExceptionResolver implements HandlerExceptionResolver {
	
	
	@Override
	public ModelAndView resolveException(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2,
			Exception arg3) {
		
		System.out.println("异常开始-----");
		arg3.printStackTrace();
		System.out.println("异常结束------");
		StudentException studentException = null;
		if(arg3 instanceof StudentException) {
			studentException = (StudentException)arg3;
		} else {
			studentException = new StudentException("程序出错了");
		}
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("exception", studentException.getMessage());
		mav.setViewName("error");
		return mav;
	}

}
