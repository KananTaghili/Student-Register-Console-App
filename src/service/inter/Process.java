package service.inter;

import bean.Teacher;

public class Process {
	public void processLogic() {}
	public void processLogic(Teacher teacher) {}

	public void process() {
		processLogic();
	}
	public void process(Teacher teacher) {
		processLogic(teacher);
	}
}
