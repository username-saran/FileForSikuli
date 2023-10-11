package com.demo;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Demo {
	public static void main(String[] args) throws FindFailed {
		Screen screen = new Screen();
		Pattern pattern = new Pattern("C:\\Users\\mails\\Pictures\\Screenshots\\Minimize.png");
		Pattern pattern1 = new Pattern("C:\\Users\\mails\\Pictures\\Screenshots\\Windows.png");
		screen.click(pattern);
		screen.click(pattern1);
	}
}
