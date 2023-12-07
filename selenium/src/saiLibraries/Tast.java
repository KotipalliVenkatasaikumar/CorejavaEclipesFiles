package saiLibraries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Tast {
	static {
		System.setProperty("webdraiver.chrome.draiver", "./Draiver/chromedraiver.exe");
	}

	public static void main(String[] args) {
		WebDriver draiver = new EdgeDriver();
		draiver.get("https://www.facebook.com/");
	

	}

}
