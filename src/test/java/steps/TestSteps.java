package steps;

import io.cucumber.java.en.*;
import pages.TestPage;

public class TestSteps {
    /*
     ** PAGE INSTANCE **
     */

    TestPage testPage = new TestPage();

    @Given("the user is on the home screen of yltrue.com")
    public void theUserIsOnTheHomeScreenOfUndercDeOrg() {
        testPage.navigateToMainURL();
    }

    @And("^the user click the \"(.*)\" button$")
    public void theUserClickTheButton(String button) {
        testPage.clickButtons(button);
    }


    @Given("^the user enter the user: \"(.*)\" and password: \"(.*)\"$")
    public void theUserEnterTheUserAndPassword(String user, String pass) {
        testPage.loginCredentials(user,pass);
    }

    @When("the user click the login button")
    public void theUserClickTheLoginButton() {
        testPage.clickLoguinButton();
    }

    @Then("^the user verify that the status of button \"(.*)\" change to \"disabled\"$")
    public void theUserVerifyThatTheStatusOfButtonChangeTo(String button) {
        testPage.verifyButtonStatus(button);
    }

    @When("^the user click the \"(.*)\" button \"(.*)\" times$")
    public void theUserClickTheButtonTimes(String button, String times) {
        testPage.clickSizeButtons(button, times);
    }

    @Then("^the user verify the font size \"(.*)\"$")
    public void theUserVerifyTheFontSize(String action) {
        testPage.verifySizeChanged(action);
    }

    @When("^the user enter the \"(.*)\" color in the input$")
    public void theUserEnterTheColorInTheInput(String color) {
        testPage.enterColorInput(color);
    }

    @And("^the user press the \"(.*)\" button$")
    public void theUserPressTheButton(String button) {
        testPage.clickColorbutton();
    }

    @Then("^the user verify the background color was changed to \"(.*)\"$")
    public void theUserVerifyTheBackgroundColorWasChanged(String color) {
        testPage.verifyBackgroundChanged(color);
    }
}
