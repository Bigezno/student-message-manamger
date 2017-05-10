package service;

import java.util.List;

import pojo.Student;

public interface StudentService {
	
	//获取Student
	Student getStudent(int id);
	
	//获取所有Student的信息
	List<Student> getAllStudents();
	
	void saveStudent(Student student); //添加
	
	void deleteStudent(Student student); //删除
	
	void updateStudent(Student student); //修改
	
}
