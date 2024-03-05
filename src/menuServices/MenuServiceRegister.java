package menuServices;

import bean.Teacher;
import main.Data;
import main.FileSave;
import main.MenuUtil;
import main.RequireAndReturn;

public class MenuServiceRegister extends MenuService {
	
	public void process() {
		
		String username = RequireAndReturn.text("Enter username");
		String password = RequireAndReturn.text("Enter password");
		
		for (int i = 0; i < Data.d.teacher.size(); i++) {
			if(username.equals(Data.d.teacher.get(i).username)) {
				RequireAndReturn.text("Same username\nPress enter to continue");
				MenuUtil.registerMenu();
				break;
			}
		}

		Data.d.teacher.add(new Teacher(username, password));
		FileSave.saveFile();
		RequireAndReturn.text("Register succesfully\nPress enter to continue");
		
		MenuUtil.registerMenu();
	}
}