package menuServices;

import java.util.ArrayList;

import bean.Teacher;
import main.MenuUtil;
import main.Process;
import main.RequireAndReturn;

public class MenuServiceFind extends MenuService {

	@Override
	public void process(Teacher teacher) {

		String text = RequireAndReturn.text("Enter name, surname, classname or ID:");
		ArrayList<Integer> count = Process.findStudent(teacher, text);
		if (count.size() == 0)
			System.out.println("No account found!");

		RequireAndReturn.text("Press enter to continue");
		MenuUtil.accountMenu(teacher);
	}
}
