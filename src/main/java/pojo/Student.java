package pojo;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;

import validator.Sex;
import validator.ValidatorGroup1;
import validator.phone;

public class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int id;   // 学号
	
	@Size(min=1,max=20,message="{username.not.illegal}",groups=ValidatorGroup1.class)
	@NotNull(message ="{username.not.empty}",groups=ValidatorGroup1.class)
	private String name; // 姓名
	
	@NotNull(message="{password.not.empty}",groups=ValidatorGroup1.class)  
	@Size(min=6,max=10,message = "{password.not.illegal}",groups=ValidatorGroup1.class)
	private String password; // 密码
	
	@Sex(message="{sex.not.illegal}",groups=ValidatorGroup1.class)
	@NotNull(message ="{sex.not.empty}",groups=ValidatorGroup1.class)
	private String sex; 	// 性别
	
	@NotNull(message ="{specialty.not.empty}",groups=ValidatorGroup1.class)
	private String specialty; // 专业
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@NotNull(message ="{birthday.not.empty}",groups=ValidatorGroup1.class)
	private Date birthday;   // 生日
	
	@phone(message="{phone_number.not.illegal}",groups=ValidatorGroup1.class)
	@NotNull(message ="{phone_number.not.empty}",groups=ValidatorGroup1.class)
	private String phone_number; //电话
	
	@NotNull(message ="{address.not.empty}",groups=ValidatorGroup1.class)
	private String address; //地址
	
	@Email(groups=ValidatorGroup1.class) 
	private String email; //邮箱
	
	
	private int class_id;
	private int coures_id;
	
	
	public int getClass_id() {
		return class_id;
	}
	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}
	public int getCoures_id() {
		return coures_id;
	}
	public void setCoures_id(int coures_id) {
		this.coures_id = coures_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", password=" + password + ", sex=" + sex + ", specialty="
				+ specialty + ", birthday=" + birthday + ", phone_number=" + phone_number + ", address=" + address
				+ ", email=" + email + ", class_id=" + class_id + ", coures_id=" + coures_id + "]";
	}
	
	
	
}
