package day1;

import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JmeterTest {


	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "E:\\LTI\\Training\\SelJars\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.getTitle();
		System.out.println("This is test 1");
		System.out.println("This is test 2");
		System.out.println("This is test 3");
		System.out.println("This is test 4");
		
		//Branching
		System.out.println("This is test 5");
		System.out.println("This is test 6");
		
		
	}

}
