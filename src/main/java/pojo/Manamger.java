package pojo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import validator.ValidatorGroup1;

public class Manamger {
	
	@Pattern(regexp="enzo",message="账号错误",groups=ValidatorGroup1.class)
	@NotNull(message="账号不能为空",groups=ValidatorGroup1.class)
	private String name;
	
	@Pattern(regexp="123456",message="密码错误",groups=ValidatorGroup1.class)
	@NotNull(message="密码不能为空",groups=ValidatorGroup1.class)
	private String password;

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
		return "Manamger [name=" + name + ", password=" + password + "]";
	}
	
	
	
	
	
	
	
}
