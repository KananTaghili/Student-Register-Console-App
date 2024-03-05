package menuServices;

import bean.Teacher;
import main.MenuUtil;
import main.Process;
import main.RequireAndReturn;

public class MenuServiceShow extends MenuService {

	@Override
	public void process(Teacher teacher) {
		Integer count = Process.showStudent(teacher);
		if (count == 0)
			System.out.println("No student found");
		RequireAndReturn.text("Press enter to continue");
		MenuUtil.accountMenu(teacher);
	}
}
