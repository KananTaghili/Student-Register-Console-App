package main;

import java.util.ArrayList;
import bean.Teacher;

public class Process {

	public static Integer showStudent(Teacher teacher) {
		int count = 0;

		for (int i = 0; i < teacher.student.size(); i++) {
			System.out.println((teacher.student.indexOf(teacher.student.get(i)) + 1) + "." + teacher.student.get(i));
			count++;
		}
        return count;
	}

	public static ArrayList<Integer> findStudent(Teacher teacher, String text) {
		ArrayList<Integer> index = new ArrayList<Integer>();

		for (int i = 0; i < teacher.student.size(); i++) {
			if (teacher.student.get(i).name.contains(text)
					|| teacher.student.get(i).surname.contains(text)
					|| teacher.student.get(i).className.contains(text)
					|| teacher.student.get(i).id.contains(text)) {
				index.add(teacher.student.indexOf(teacher.student.get(i)));
				System.out.println((teacher.student.indexOf(teacher.student.get(i)) + 1) + "." + teacher.student.get(i));
			}
		}
		return index;
	}
}