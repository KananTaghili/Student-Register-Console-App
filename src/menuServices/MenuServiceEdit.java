package menuServices;

import java.util.ArrayList;
import java.util.InputMismatchException;
import bean.Teacher;
import main.FileSave;
import main.MenuUtil;
import main.Process;
import main.RequireAndReturn;

public class MenuServiceEdit extends MenuService {

	@Override
	public void process(Teacher teacher) {

		String text = RequireAndReturn.text("Enter name, surname, classname or ID:");
		ArrayList<Integer> index = Process.findStudent(teacher, text);

		if (index.size() != 0) {
			try {
				int count = 0;
				Integer i = RequireAndReturn.number("Please choose one:");
				for (int j = 0; j < index.size(); j++) {
					if (i == index.get(j) + 1)
						count++;
				}
				if (count == 0)
					throw new IndexOutOfBoundsException();
				teacher.student.get(i - 1).setStudentData((" new "));
				FileSave.saveFile();
				System.out.println("Student updated");
			} catch (IndexOutOfBoundsException ex) {
				System.out.println("You entered wrong index");
			} catch (InputMismatchException ex) {
				System.out.println("Index must be number!");
			}
		} else
			System.out.println("No student found!");

		RequireAndReturn.text("Press enter to continue");
		MenuUtil.accountMenu(teacher);
	}
}
