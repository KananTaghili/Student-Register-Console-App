package service.inter;

import main.FileSave;

public class SavableProcess extends Process {
	public void process() {
		processLogic();
		FileSave.saveFile();
	}
}
