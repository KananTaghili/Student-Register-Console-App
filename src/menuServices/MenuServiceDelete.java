package menuServices;

import bean.Teacher;
import main.Data;
import main.FileSave;
import main.MenuUtil;
import main.RequireAndReturn;

public class MenuServiceDelete extends MenuService {

	@Override
	public void process(Teacher teacher) {
		String s = RequireAndReturn.text("Enter password:");

		if (s.equals(teacher.password)) {
			Data.d.teacher.remove(teacher);
			System.out.println("Account deleted");
			FileSave.saveFile();
			RequireAndReturn.text("Press enter to continue");
			MenuUtil.registerMenu();
		} else {
			System.out.println("Wrong password");
			RequireAndReturn.text("Press enter to continue");
			MenuUtil.accountMenu(teacher);
		}
	}
}
