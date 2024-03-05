package main;

import bean.Teacher;

public class MenuUtil {

	public static void registerMenu() {
		MenuEnum.showMenu(0, 2);
		MenuEnum.findMenu(0, 2).process();
	}

	public static void accountMenu(Teacher teacher) {
		MenuEnum.showMenu(2, 10);
		MenuEnum.findMenu(2, 10).process(teacher);
	}
}
