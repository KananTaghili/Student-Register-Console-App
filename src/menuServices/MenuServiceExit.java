package menuServices;

import bean.Teacher;
import main.MenuUtil;

public class MenuServiceExit extends MenuService {

	@Override
	public void process(Teacher teacher) {
		MenuUtil.registerMenu();
	}
}
