package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.Baseclass;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='outlined-basic1']")
	private WebElement username;

	@FindBy(xpath = "//input[@id='outlined-basic2']")
	private WebElement password;

	@FindBy(xpath = "//button[normalize-space()='Login']")
	private WebElement loginbtn;

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public void setLoginbtn(WebElement loginbtn) {
		this.loginbtn = loginbtn;
	}

}
