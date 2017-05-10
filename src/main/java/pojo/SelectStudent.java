package pojo;

import java.io.Serializable;
import java.util.List;

public class SelectStudent implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int s_id;
	private int select_course_id;
	private List<SelectCourse> listCourse;
	private String grade;
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public List<SelectCourse> getListCourse() {
		return listCourse;
	}
	public void setListCourse(List<SelectCourse> listCourse) {
		this.listCourse = listCourse;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	public int getSelect_course_id() {
		return select_course_id;
	}
	public void setSelect_course_id(int select_course_id) {
		this.select_course_id = select_course_id;
	}
	@Override
	public String toString() {
		return "SelectStudent [s_id=" + s_id + ", select_course_id=" + select_course_id + ", listCourse=" + listCourse
				+ ", grade=" + grade + "]";
	}
	
	
	
	
	
}
