package exception;

public class StudentException extends Exception {

	private static final long serialVersionUID = 1L;
	
	//异常信息
	private String message;
	
	public StudentException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
