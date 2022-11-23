package testClass;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {

	public static WebDriver driver;

	@BeforeMethod
	public void launchDriver() {

		System.setProperty("webdriver.chrome.driver", "c:\\browserdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.navigate().to("http://AutomationTalks.com/");
	}

	@Test
	public void test1() {

		System.out.println("test 1 title = " + driver.getTitle());
		System.out.println("changing from master branch");
        System.out.println("branch120");
		System.out.println("branch120.......");
		
	}

	@Test
	public void test2() {

		System.out.println("test 2 title = " + driver.getTitle());

	}

	@Test
	public void test3() {

		System.out.println("test 3 title = " + driver.getTitle());
	}
}
