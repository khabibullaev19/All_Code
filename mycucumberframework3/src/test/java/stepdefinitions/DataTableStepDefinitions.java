package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablePage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class DataTableStepDefinitions {

    DataTablePage dataTablePage = new DataTablePage();

    @Given("user is on the data tables page")
    public void user_is_on_the_data_tables_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("data_table_url"));
    }

    @Given("user clicks on the new button")
    public void user_clicks_on_the_new_button() {
        dataTablePage.newBtn.click();
    }

    @When("user enters the firstname")
    public void user_enters_the_firstname() {
        dataTablePage.firsNameBox.sendKeys("Ali");
    }

    @When("user enters the lastname")
    public void user_enters_the_lastname() {
        dataTablePage.lastNameBox.sendKeys("Khab");
    }

    @When("user enters the position")
    public void user_enters_the_position() {
        dataTablePage.positionBox.sendKeys("SDET");
    }

    @When("user enters the office")
    public void user_enters_the_office() {
        dataTablePage.officeBox.sendKeys("Remote");
    }

    @When("user enters the extension")
    public void user_enters_the_extension() {
        dataTablePage.extensionBox.sendKeys("321321");
    }

    @When("user enters the startdate")
    public void user_enters_the_startdate() {
        dataTablePage.startDateBox.sendKeys("2020-10-04");
    }

    @When("user enters the salary")
    public void user_enters_the_salary() {
        dataTablePage.salaryBox.sendKeys("100000");
    }

    @When("user clicks on the create button")
    public void user_clicks_on_the_create_button() {
        dataTablePage.createBtn.click();
    }

    @When("search for the first name")
    public void search_for_the_first_name() {
        dataTablePage.searchBox.sendKeys("Ali");
    }

    @Then("verify the name field contains first name")
    public void verify_the_name_field_contains_first_name() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(dataTablePage.nameField.getText().contains("Ali"));
    }

    @When("user enters the firstname {string}")
    public void user_enters_the_firstname(String string) {
        dataTablePage.firsNameBox.sendKeys(string);
    }
    @When("user enters the lastname {string}")
    public void user_enters_the_lastname(String string) {
        dataTablePage.lastNameBox.sendKeys(string);
    }
    @When("user enters the position {string}")
    public void user_enters_the_position(String string) {
        dataTablePage.positionBox.sendKeys(string);
    }
    @When("user enters the office {string}")
    public void user_enters_the_office(String string) {
        dataTablePage.officeBox.sendKeys(string);
    }
    @When("user enters the extension {string}")
    public void user_enters_the_extension(String string) {
        dataTablePage.extensionBox.sendKeys(string);
    }
    @When("user enters the startdate {string}")
    public void user_enters_the_startdate(String string) {
        dataTablePage.startDateBox.sendKeys(string);
    }
    @When("user enters the salary {string}")
    public void user_enters_the_salary(String string) {
        dataTablePage.salaryBox.sendKeys(string);
    }
    @When("search for the firstname {string}")
    public void search_for_the_firstname(String string) {
        dataTablePage.searchBox.sendKeys(string);
    }
    @Then("verify the name field contains firstname {string}")
    public void verify_the_name_field_contains_firstname(String string) throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(dataTablePage.nameField.getText().contains(string));
    }
}
