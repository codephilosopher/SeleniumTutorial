package selenium.testng.test12;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.TestNG;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {

	public static void main(String[] args) {
		TestNG runner=new TestNG();
		List<String> suitefiles=new ArrayList<String>();
		suitefiles.add("C:\\Users\\prade\\git\\SeleniumTutorial\\testngtest2.xml");
		runner.setTestSuites(suitefiles);
		runner.run();
	}
}

class TestNgTest {
	@Test
	public void SampleTest_01() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
	}
	@Test
	public void SampleTest_02() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
	}
}
