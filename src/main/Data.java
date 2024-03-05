package main;

import java.io.Serializable;
import java.util.ArrayList;
import bean.Teacher;

public class Data implements Serializable {
	private static final long serialVersionUID = 1L;
	public ArrayList<Teacher> teacher = new ArrayList<Teacher>();
	public Integer i = 0;

	public static Data d = FileSave.getData();

	public static Data instance() {
		if (d == null) {
			d = new Data();
		}
			return d;
	}
}
