package dao;


import pojo.SelectStudent;


public interface SelectStudentDao {
	
	//学生选课
	void saveSelectStudent(SelectStudent selectStudent);
	
	//老师添加成绩
	void addStudentGrade(SelectStudent selectStudent);
	
	//学生查看成绩,成绩在SelectStudent中的grade中
	SelectStudent lookSelectCourseGrade(SelectStudent selectStudent);
}
