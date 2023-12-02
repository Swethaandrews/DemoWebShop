package tests;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.BaseTest;
import pages.LoginPage;


public class LoginTest extends BaseTest {
	LoginPage loginPage;

	@Test
	public void test_Login_Page() {
		
		loginPage=new LoginPage(driver);
		String email="Itest@test.com";
		String password="Itest@test";
		loginPage.enter_Login_Details(email, password);
		
		
	}
	
	@BeforeTest
	public void open_browser() {
		openBrowser();
	}		
}

	
	


