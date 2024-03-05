package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RequireAndReturn {
	
	public static String text(String s) {
		Scanner sc = method();
		System.out.println(s);
		return sc.nextLine();
	}
	public static Integer number(String s) throws InputMismatchException, IndexOutOfBoundsException  {
		Scanner sc = method();
		System.out.println(s);
		return sc.nextInt();
	}
	
	public static Scanner method() {
		Scanner sc = new Scanner(System.in);
		return sc;
	}
}