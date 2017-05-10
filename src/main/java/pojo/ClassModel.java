package pojo;

import java.io.Serializable;

public class ClassModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String class_name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	@Override
	public String toString() {
		return "ClassModel [id=" + id + ", class_name=" + class_name + "]";
	}
	
}
