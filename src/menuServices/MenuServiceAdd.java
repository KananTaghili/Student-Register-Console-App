package menuServices;

import java.util.InputMismatchException;

import bean.Student;
import bean.Teacher;
import main.Data;
import main.FileSave;
import main.MenuUtil;
import main.RequireAndReturn;

public class MenuServiceAdd extends MenuService{

	@Override
	public void process(Teacher teacher) {
		try {
			Student newStudent = new Student();
			newStudent.setStudentData(" ");
			teacher.student.add(newStudent);
			System.out.println("Student added");
		}catch(InputMismatchException ex) {
				System.out.println("Age must be number!");
				Data.d.i--;
		}
		
		FileSave.saveFile();
	    RequireAndReturn.text("Press enter to continue");
		MenuUtil.accountMenu(teacher);		
	}
}
