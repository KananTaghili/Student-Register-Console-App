package bean;

import java.io.Serializable;
import java.util.InputMismatchException;
import main.Data;
import main.RequireAndReturn;

public class Student implements  Serializable{

	private static final long serialVersionUID = 1L;
	public String name;
	public String surname;
	public Integer age;
	public String className;
	public String id;
	
	public Student() {
		Integer i = 999 - Data.d.i;
		String id = i.toString();
		this.id = id;
		Data.d.i++;
	}
	
	public void setStudentData(String t) throws InputMismatchException {
		
		this.name = RequireAndReturn.text("Enter" + t + "name:");
		this.surname = RequireAndReturn.text("Enter" + t + "surname:");
		this.age = RequireAndReturn.number("Enter" + t + "age:");
		this.className = RequireAndReturn.text("Enter" + t + "class:");
	}
	
	@Override
	public String toString() {	
		return this.id + " "+ this.name + " " + this.surname + " " + this.className + " " + this.age;	
	}
}