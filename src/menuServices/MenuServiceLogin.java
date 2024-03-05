package menuServices;

import main.Data;
import main.MenuUtil;
import main.RequireAndReturn;

public class MenuServiceLogin extends MenuService {

	@Override
	public void process() {

		String username = RequireAndReturn.text("Enter username");
		String password = RequireAndReturn.text("Enter password");

		for (int i = 0; i < Data.d.teacher.size(); i++) {
			if (username.equals(Data.d.teacher.get(i).username)) {
					if (password.equals(Data.d.teacher.get(i).password)) {
						MenuUtil.accountMenu(Data.d.teacher.get(i));
						break;
					}
				RequireAndReturn.text("Wrong password\nPress enter to continue");
				MenuUtil.registerMenu();
				break;
			}
		}
		RequireAndReturn.text("Wrong username\nPress enter to continue");
		MenuUtil.registerMenu();
	}
}
