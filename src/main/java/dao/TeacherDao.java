package dao;

import java.util.List;

import pojo.Teacher;

public interface TeacherDao {
	
	Teacher getTeacher(int id); //查找一个用户
	
	List<Teacher> getAllTeachers();//查找所有用户信息
	
	void saveTeacher(Teacher teacher); //添加
	
	void deleteTeacher(Teacher teacher); //删除
	
	void updateTeacher(Teacher teacher); //修改
	
}
