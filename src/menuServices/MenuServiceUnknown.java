package menuServices;

import bean.Teacher;
import main.MenuUtil;

public class MenuServiceUnknown extends MenuService {
	@Override
	public void process() {
		MenuUtil.registerMenu();
	}
	public void process(Teacher teacher) {
		MenuUtil.accountMenu(teacher);
	}
}
