package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.SelectCourseDao;
import pojo.SelectCourse;
import service.SelectCourseService;

@Service("selectCourseService")
public class SelectCourseServiceImpl implements SelectCourseService {

	@Autowired
	private SelectCourseDao selectCourseDao;
	
	@Override
	public List<SelectCourse> getCourseMessage() {
		
		return selectCourseDao.getCourseMessage();
	}

}
