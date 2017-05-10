package pojo;

import java.io.Serializable;
import java.util.List;

//选课
public class SelectCourse implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private int id;
	
	private String course_name;
	
	private String time;
	
	private String address;
	
	private Teacher teacher; //只能得到老师的id和name
	
	private List<Student> list; //关联的学生只能得到他们的s_id,name,specialty

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
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

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "SelectCourse [id=" + id + ", course_name=" + course_name + ", time=" + time + ", address=" + address
				+ ", teacher_name=" + teacher.getName() + ", teacher_name="+teacher.getId() +"]";
	}

	
	
	
}
