package pojo;

import java.io.Serializable;
import java.util.List;

public class Course implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private int c_id;
	private String course_name;
	private String time;
	private String address;
	
	private Teacher teacher;
	private ClassModel clazz;
	private List<Student> studentList;
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public ClassModel getClazz() {
		return clazz;
	}
	public void setClazz(ClassModel clazz) {
		this.clazz = clazz;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	@Override
	public String toString() {
		return "Course [c_id=" + c_id + ", course_name=" + course_name + ", time=" + time + ", address=" + address
				+ ", teacher=" + teacher + ", clazz=" + clazz + "]";
	}
	
	
	
}
