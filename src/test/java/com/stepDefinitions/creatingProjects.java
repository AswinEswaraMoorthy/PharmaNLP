package com.stepDefinitions;

import java.io.IOException;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.utils.Baseclass;
import com.utils.ExcelReader;
import com.utils.constantValues;

import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.createProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;

public class creatingProjects extends Baseclass {
	public static LoginPage login;
	public static ExcelReader Excel;
	public static createProject CP;
	public static constantValues constantValues;
	Object[][] objectArray;

	@When("user creates a project without Add Collaborators")
	public void creating_project_withoutAddcollaborators() {
		implictwait();
		CP = new createProject(driver);
		CP.getAddProjectButton().click();
		explicitwait();
		CP.getProjectNameTextBox().sendKeys("Test_00" + randomNumberString);
		CP.getProjectDescriptionTextBox().sendKeys("TestDescription_00" + randomNumberString);
		CP.getPopulation_Included().sendKeys("Adults (>=18 years) with advanced/metastatic  NSCLC");
		CP.getIntervention_Include().sendKeys("Studies of pediatric populations");
		CP.getComparator_Included().sendKeys("Bevacizumab, Ramucirumab, Nivolumab, Pembrolizumab");
		CP.getStudyCome_Included().sendKeys("Radioimmunotherapy, chemotherapy in combination with radiotherapy, or surgery");
		CP.getCreateButton().click();
		explicitwait();
		//toaster();
		validateToasterMessage(driver, CP.getCreateprojecttoaster(),constantValues.projectaddedToaster);
	    System.out.println("Toaster passed .............................."+CP.getCreateprojecttoaster());
	}

	@When("Verify the Project is created successfully without Add collaborators")
	public void verify_toaster_message_withoutAddcollaborators() {
		explicitwait();
		String actualToasterContent = CP.getcreateToasterMessage().getText();
		Assert.assertEquals(constantValues.createToaster, actualToasterContent);

	}

	@When("user creates a project with Add Collaborators")
	public void creating_project_withAddcollaborators() throws InterruptedException, AWTException, IOException {
		explicitwait();
		Thread.sleep(4000);
		CP.getprojectbackbtn().click();
		explicitwait();
		CP.getAddProjectButton().click();
		explicitwait();
		CP.getProjectNameTextBox().sendKeys("Test_11" + randomNumberString);
		CP.getProjectDescriptionTextBox().sendKeys("TestDescription_11" + randomNumberString);
		CP.getPopulation_Included().sendKeys("Adults (>=18 years) with advanced/metastatic  NSCLC");
		CP.getIntervention_Include().sendKeys("Studies of pediatric populations");
		CP.getComparator_Included().sendKeys("Bevacizumab, Ramucirumab, Nivolumab, Pembrolizumab");
		CP.getStudyCome_Included().sendKeys("Radioimmunotherapy, chemotherapy in combination with radiotherapy, or surgery");

		Excel = new ExcelReader();
		objectArray = Excel.getTestData();

		String addcollaborators = (String) objectArray[1][0];

		CP.getaddcollaborators().sendKeys(addcollaborators);
		CP.getaddcollaborators().sendKeys(Keys.ARROW_DOWN);
		CP.getaddcollaborators().sendKeys(Keys.ENTER);

		CP.getCreateButton().click();
		validateToasterMessage(driver, CP.getCreateprojecttoaster(),constantValues.projectaddedToaster);
	    System.out.println("Add collab $$$$$$$$$$$$$$$$$$$$$$$ Toaster passed .............................."+CP.getCreateprojecttoaster());

	}

	@When("Verify the Project is created successfully with Add collaborators")
	public void verify_toaster_message_withAddcollaborators() {
		explicitwait();
		String actualToasterContent = CP.getcreateToasterMessage().getText();
		Assert.assertEquals(constantValues.createToaster, actualToasterContent);
	}

	@When("user creates a project with ByPassscreeningProcess")
	public void user_creates_a_project_with_by_passscreening_process() throws InterruptedException {
		explicitwait();
		Thread.sleep(4000);
		CP.getprojectbackbtn().click();
		explicitwait();
		CP.getAddProjectButton().click();
		explicitwait();
		CP.getProjectNameTextBox().sendKeys("Test_22" + randomNumberString);
		CP.getProjectDescriptionTextBox().sendKeys("TestDescription_22" + randomNumberString);
		CP.getProjectNameTextBox().sendKeys("Test_11" + randomNumberString);
		CP.getProjectDescriptionTextBox().sendKeys("TestDescription_11" + randomNumberString);
		CP.getPopulation_Included().sendKeys("Adults (>=18 years) with advanced/metastatic  NSCLC");
		CP.getIntervention_Include().sendKeys("Studies of pediatric populations");
		CP.getComparator_Included().sendKeys("Bevacizumab, Ramucirumab, Nivolumab, Pembrolizumab");
		CP.getStudyCome_Included().sendKeys("Radioimmunotherapy, chemotherapy in combination with radiotherapy, or surgery");


		CP.getBypassscreeningprocess().click();

		CP.getCreateButton().click();
		
		validateToasterMessage(driver, CP.getCreateprojecttoaster(),constantValues.projectaddedToaster);
	    System.out.println("))))))))))))))) $$$$$$$$$$$$$$$$$$$$$$$ Toaster passed .............................."+CP.getCreateprojecttoaster());

	}

	@When("user creates a project with guest user and Configure Fields for Data Extraction")
	public void user_creates_a_project_with_guest_user_and_configure_fields_for_data_extraction()
			throws InterruptedException {
		explicitwait();
		Thread.sleep(8000);
		CP.getprojectbackbtn().click();
		explicitwait();
		CP.getAddProjectButton().click();
		explicitwait();
		CP.getProjectNameTextBox().sendKeys("Test_3" + randomNumberString);
		CP.getProjectDescriptionTextBox().sendKeys("TestDescription_3" + randomNumberString);
		CP.getProjectNameTextBox().sendKeys("Test_11" + randomNumberString);
		CP.getProjectDescriptionTextBox().sendKeys("TestDescription_11" + randomNumberString);
		CP.getPopulation_Included().sendKeys("Adults (>=18 years) with advanced/metastatic  NSCLC");
		CP.getIntervention_Include().sendKeys("Studies of pediatric populations");
		CP.getComparator_Included().sendKeys("Bevacizumab, Ramucirumab, Nivolumab, Pembrolizumab");
		CP.getStudyCome_Included().sendKeys("Radioimmunotherapy, chemotherapy in combination with radiotherapy, or surgery");

		CP.getaddfieldbutton().click();
		explicitwait();
		CP.getaddfieldtext().sendKeys("Test");
		CP.getaddfieldtext().sendKeys(Keys.ARROW_DOWN);
		CP.getaddfieldtext().sendKeys(Keys.ENTER);
		explicitwait();
		CP.getaddfielddropdown().sendKeys("TEST!1");
		CP.getaddfielddropdown().sendKeys(Keys.ARROW_DOWN);
		CP.getaddfielddropdown().sendKeys(Keys.ENTER);
		CP.getAddbtn().click();
		CP.getsave().click();

		explicitwait();
		Thread.sleep(4000);
		CP.getCreateButton().click();
		validateToasterMessage(driver, CP.getCreateprojecttoaster(),constantValues.projectaddedToaster);
	    System.out.println("******* $$$$$$$$$$$$$$$$$$$$$$$ Toaster passed .............................."+CP.getCreateprojecttoaster());

	}

	@When("user Edit the project name")
	public void user_edit_the_project_name() throws InterruptedException {
		explicitwait();
		Thread.sleep(8000);
		CP.getprojectbackbtn().click();
		explicitwait();
		CP.getpjedit().click();
		CP.getProjectNameTextBox().sendKeys(Keys.CONTROL + "a");
		CP.getProjectNameTextBox().sendKeys(Keys.DELETE);
		CP.getProjectDescriptionTextBox().sendKeys(Keys.CONTROL + "a");
		CP.getProjectDescriptionTextBox().sendKeys(Keys.DELETE);
		CP.getProjectNameTextBox().sendKeys("Edit_01" + randomNumberString);
		CP.getProjectDescriptionTextBox().sendKeys("Edit_01" + randomNumberString);
		CP.getsave().click();
		System.out.println("edit entry");
		validateToasterMessage(driver, CP.getEdit_toaster(),constantValues.projecteditToaster);
	    System.out.println("Edit $$$$$$$$$$$$$$$$$$$$$$$ Toaster passed .............................."+CP.getEdit_toaster());

		
		
	}

	@When("user Edit the collaborators name")
	public void user_edit_the_collaborators_name() throws InterruptedException, IOException {
		explicitwait();
		Thread.sleep(8000);
		CP.getpjeditcollaborators().click();

		Excel = new ExcelReader();
		objectArray = Excel.getTestData();

		String addcollaborators = (String) objectArray[1][0];

		CP.getaddcollaborators().sendKeys(addcollaborators);
		CP.getaddcollaborators().sendKeys(Keys.ARROW_DOWN);
		CP.getaddcollaborators().sendKeys(Keys.ENTER);

		CP.getassignbtn().click();
	}

	@When("user duplictaes the project")
	public void user_duplictaes_the_project() throws InterruptedException {
		explicitwait();
		Thread.sleep(9000);
		CP.getpjduplicatebtn().click();
		CP.getpjduplicatealert().click();
		explicitwait();
		CP.getAlertcreatebtn().click();
	}

	@When("user delete the project")
	public void user_delete_the_project() throws InterruptedException {
		explicitwait();
		Thread.sleep(3000);

		try {
			CP.getpjdelete().click();
			explicitwait();
			CP.getpjdeletebtn().click();

		} catch (StaleElementReferenceException e) {
			CP.getpjdelete().click();
			explicitwait();
			CP.getpjdeletebtn().click();

		}

	}

}
