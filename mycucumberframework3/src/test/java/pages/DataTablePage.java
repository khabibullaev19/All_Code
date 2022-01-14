package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataTablePage {
    public DataTablePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//button[@type='button'])[1]")
    public WebElement newBtn;

    @FindBy(xpath = "//input[@id='DTE_Field_first_name']")
    public WebElement firsNameBox;

    @FindBy(xpath = "//input[@id='DTE_Field_last_name']")
    public WebElement lastNameBox;

    @FindBy(xpath = "//input[@id='DTE_Field_position']")
    public WebElement positionBox;

    @FindBy(xpath = "//input[@id='DTE_Field_office']")
    public WebElement officeBox;

    @FindBy(xpath = "//input[@id='DTE_Field_extn']")
    public WebElement extensionBox;

    @FindBy(xpath = "//input[@id='DTE_Field_start_date']")
    public WebElement startDateBox;

    @FindBy(xpath = "//input[@id='DTE_Field_salary']")
    public WebElement salaryBox;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//td[@class='sorting_1']")
    public WebElement nameField;

    @FindBy(xpath = "//button[@class='btn']")
    public WebElement createBtn;

}
