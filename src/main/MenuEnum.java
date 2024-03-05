package main;

import java.util.InputMismatchException;
import bean.Teacher;
import menuServices.*;

public enum MenuEnum {
	Login(1, new MenuServiceLogin()),
	Register(2, new MenuServiceRegister()), 
	Add_Student(3, new MenuServiceAdd()), 
	Remove_Student(4, new MenuServiceRemove()),
	Edit_Student(5, new MenuServiceEdit()), 
	Find_Students(6, new MenuServiceFind()),
	Show_All_Students(7, new MenuServiceShow()), 
	Update_Password(8, new MenuServiceUpdate()),
	Delete_Account(9, new MenuServiceDelete()), 
	Exit(10, new MenuServiceExit()), 
	Unknown(null, new MenuServiceUnknown());

	public MenuService menuservice;
	public Integer i;

	MenuEnum(Integer i, MenuService s) {
		this.menuservice = s;
		this.i = i;
	}

	public void process(Teacher teacher) {
		menuservice.process(teacher);
	}

	public void process() {
		menuservice.process();
	}

	public static void showMenu(Integer start, Integer finish) {
		MenuEnum[] m = MenuEnum.values();
		for (int i = start; i < finish; i++) {
			System.out.println((i + 1) + "." + m[i]);
		}
	}

	public static MenuEnum findMenu(Integer start, Integer finish) {
		try {
			Integer in = RequireAndReturn.number("Please choose one!");
			if (in <= start || in > finish)
				throw new IndexOutOfBoundsException();
			MenuEnum[] m = MenuEnum.values();
			for (int i = start; i < finish; i++) {
				if (in == m[i].i) {
					return m[i];
				}
			}
		} catch (IndexOutOfBoundsException | InputMismatchException ex) {
			if (ex instanceof IndexOutOfBoundsException)
				System.out.println("Wrong index!");
			else
				System.out.println("Index must be number!");
			return Unknown;
		}
		return Unknown;
	}
}
