package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createProject {

	public createProject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Add Project']")
	private WebElement addProjectButton;

	@FindBy(xpath = "(//label[text()='Project Name*']/following::textarea)[1]")
	private WebElement projectNameTextBox;

	@FindBy(id = "slrObjective")
	private WebElement projectDescriptionTextBox;

	@FindBy(xpath = "//button[normalize-space()='Create']")
	private WebElement createButton;

	public WebElement getAddProjectButton() {
		return addProjectButton;
	}

	public void setAddProjectButton(WebElement addProjectButton) {
		this.addProjectButton = addProjectButton;
	}

	public WebElement getProjectNameTextBox() {
		return projectNameTextBox;
	}

	public void setProjectNameTextBox(WebElement projectNameTextBox) {
		this.projectNameTextBox = projectNameTextBox;
	}

	public WebElement getProjectDescriptionTextBox() {
		return projectDescriptionTextBox;
	}

	public void setProjectDescriptionTextBox(WebElement projectDescriptionTextBox) {
		this.projectDescriptionTextBox = projectDescriptionTextBox;
	}

	public WebElement getCreateButton() {
		return createButton;
	}

	public void setCreateButton(WebElement createButton) {
		this.createButton = createButton;
	}

	// Toaster message
	@FindBy(xpath = "//p[text()='success']")
	private WebElement createToasterMessage;

	public WebElement getcreateToasterMessage() {
		return createToasterMessage;
	}

	// BackButton click
	@FindBy(xpath = "//p[text()='Home']")
	private WebElement projectbackbtn;

	public WebElement getprojectbackbtn() {
		return projectbackbtn;
	}

	// collab
	@FindBy(xpath = "(//input[@role='combobox'])[1]")
	private WebElement addcollaborators;

	public WebElement getaddcollaborators() {
		return addcollaborators;
	}

	// Assign_Button
	@FindBy(xpath = "//p[text()='Assign']")
	private WebElement assignbtn;

	public WebElement getassignbtn() {
		return assignbtn;
	}

	// Bypass screening process
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement Bypassscreeningprocess;

	public WebElement getBypassscreeningprocess() {
		return Bypassscreeningprocess;
	}

	// Add field button
	@FindBy(xpath = "//*[text()='Add Field']")
	private WebElement addfieldbutton;

	public WebElement getaddfieldbutton() {
		return addfieldbutton;
	}

	// addfieldtext
	@FindBy(id = "name")
	private WebElement addfieldtext;

	public WebElement getaddfieldtext() {
		return addfieldtext;
	}

	// addfielddropdown
	@FindBy(name = "addOption")
	private WebElement addfielddropdown;

	public WebElement getaddfielddropdown() {
		return addfielddropdown;
	}

	@FindBy(xpath = "//button[@aria-label='Add Option']")
	private WebElement Addbtn;

	public WebElement getAddbtn() {
		return Addbtn;
	}

	// savedropbtn
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement save;

	public WebElement getsave() {
		return save;
	}

	// Project_edit
	@FindBy(xpath = "(//button[@title='Edit Project'])[1]")
	private WebElement pjedit;

	public WebElement getpjedit() {
		return pjedit;
	}

	// Projectpage_pjeditcollaborators
	@FindBy(xpath = "//button[@title='Edit Collaborators'][1]")
	private WebElement pjeditcollaborators;

	public WebElement getpjeditcollaborators() {
		return pjeditcollaborators;
	}

	// projectpage_pjduplicate
	@FindBy(xpath = "(//button[@title='Duplicate Project'])[1]")
	private WebElement pjduplicatebtn;

	public WebElement getpjduplicatebtn() {
		return pjduplicatebtn;
	}

	// project-Pjduplicate_Alert
	@FindBy(xpath = "(//input[@type='radio'])[2]")
	private WebElement pjduplicatealert;

	public WebElement getpjduplicatealert() {
		return pjduplicatealert;
	}

	// pjcreate
	@FindBy(xpath = "//button[text()='Create']")
	private WebElement Alertcreatebtn;

	public WebElement getAlertcreatebtn() {
		return Alertcreatebtn;
	}
	
	// pjdelete
	@FindBy(xpath = "//button[@title='Delete']")
	private WebElement pjdelete;

	public WebElement getpjdelete() {
		return pjdelete;
	}

	//
	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement pjdeletebtn;

	public WebElement getpjdeletebtn() {
		return pjdeletebtn;
	}

	
	//newly added
	@FindBy(id = "populationInclusionCriteria")
	private WebElement Population_Included;

	public WebElement getPopulation_Included() {
		return Population_Included;
	}
	
	@FindBy(id = "interventionInclusionCriteria")
	private WebElement Intervention_Included;

	public WebElement getIntervention_Include() {
		return Intervention_Included;
	}
	
	@FindBy(id = "outcomeInclusionCriteria")
	private WebElement Comparator_Included;

	public WebElement getComparator_Included() {
		return Comparator_Included;
	}
	
	@FindBy(id = "studyDesignInclusionCriteria")
	private WebElement StudyCome_Included;

	public WebElement getStudyCome_Included() {
		return StudyCome_Included;
	}
	
	//toaster edit
	
	@FindBy(xpath = "//p[text()='Project added successfully']")
	private WebElement Createprojecttoaster;

	public WebElement getCreateprojecttoaster() {
		return Createprojecttoaster;
	}
	
	@FindBy(xpath="//p[text()='Project updated successfully']")
	private WebElement Edit_toaster;

	public WebElement getEdit_toaster() {
		return Edit_toaster;
	}
}
