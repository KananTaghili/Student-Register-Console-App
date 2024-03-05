package menuServices;

import bean.Teacher;
import main.FileSave;
import main.MenuUtil;
import main.RequireAndReturn;

public class MenuServiceUpdate extends MenuService {

	@Override
	public void process(Teacher teacher) {
		String s = RequireAndReturn.text("Enter password:");

		if (s.equals(teacher.password)) {
			teacher.password = RequireAndReturn.text("Enter new password:");
			FileSave.saveFile();
			System.out.println("Password succesfully changed");

		} else
			System.out.println("Wrong password");
		
		RequireAndReturn.text("Press enter to continue");
		MenuUtil.accountMenu(teacher);
	}
}
