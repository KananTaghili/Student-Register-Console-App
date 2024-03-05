package bean;

import java.io.Serializable;
import java.util.ArrayList;
public class Teacher implements Serializable {

	private static final long serialVersionUID = 1L;
	public String username;
	public String password;
	public ArrayList<Student> student = new ArrayList<Student>();
	
	public Teacher(String username, String password) {
		this.username = username;
		this.password = password;
	}
}
