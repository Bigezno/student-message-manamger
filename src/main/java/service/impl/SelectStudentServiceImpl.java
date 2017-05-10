package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.SelectStudentDao;
import pojo.SelectStudent;
import service.SelectStudentService;

@Service("SelectStudentService")
public class SelectStudentServiceImpl implements SelectStudentService {

	@Autowired
	private SelectStudentDao selectStudentDao;
	
	@Override //学生选课
	public void saveSelectStudent(SelectStudent selectStudent) {
		selectStudentDao.saveSelectStudent(selectStudent);
		
	}

	@Override  //老师添加成绩
	public void addStudentGrade(SelectStudent selectStudent) {
		selectStudentDao.addStudentGrade(selectStudent);
		
	}

	@Override  //学生查看成绩
	public SelectStudent lookSelectCourseGrade(SelectStudent selectStudent) {
		return selectStudentDao.lookSelectCourseGrade(selectStudent);
	}

}
