package pojo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

import validator.ValidatorGroup1;

public class Teacher implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	private int id;
	
	private int c_id;
	
	@NotNull(message="姓名不能为空",groups=ValidatorGroup1.class)
	private String name;
	
	@NotNull(message="密码不能为空",groups=ValidatorGroup1.class)
	private String password;
	
	@Email(groups=ValidatorGroup1.class)
	private String email;
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", c_id=" + c_id + ", name=" + name + ", password=" + password + ", email=" + email
				+ "]";
	}

	
	
	
	
}
