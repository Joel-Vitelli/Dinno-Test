package pages;

import com.core.utility.MasterPage;
import org.junit.Assert;


import static locators.TestLocators.*;

public class TestPage extends MasterPage {
    public void navigateToMainURL() {
        auto_openURLInBrowser();
    }


    public void loginCredentials(String user, String pass) {
        auto_setTextToInput(USERNAME_INPUT_XPATH,user);
        auto_setTextToInput(PASSWORD_INPUT_XPATH,pass);
    }

    public void clickLoguinButton(){
        auto_setClickElement(LOGIN_BUTTON_XPATH);
    }

    public void clickButtons(String button){
        if (button.equals("DO1!")){
            clickDO1Button();
        } else {
            clickDO1Button();
            clickDO2Button();
        }
    }

    public void verifyButtonStatus(String button){
        if (button.equals("DO1!")){
            verifyStatusD01();
        } else {
            verifyStatusD02();
        }
    }

    public void clickSizeButtons(String button, String times) {
        if (button.equals("▲")){
            for (int i = 0; i < Integer.parseInt(times); i++) {
                auto_setClickElement(INCREASE_FONT_BUTTON_XPATH);
            }
        } else {
            for (int i = 0; i < Integer.parseInt(times); i++) {
                auto_setClickElement(DECREASE_FONT_BUTTON_XPATH);
            }
        }
    }

    public void verifySizeChanged(String button){
        if (button.equals("increases")){
            Assert.assertTrue(auto_getAttribute(FONT_P_XPATH, "style").contains("38px"));
        } else {
            Assert.assertTrue(auto_getAttribute(FONT_P_XPATH, "style").contains("2px"));
        }

    }

    public void enterColorInput(String color) {
        auto_setTextToInput(COLOR_INPUT_XPATH,color);
    }

    public void clickColorbutton() {
        auto_setClickElement(COLOR_BUTTON_XPATH);
    }

    public void verifyBackgroundChanged(String color){
        Assert.assertTrue(auto_getAttribute(BACKGROUND_DIV_XPATH,"style").contains(color));
    }

    public void clickDO1Button(){
        auto_setClickElement(DO1_BUTTON_XPATH);
    }

    public void verifyStatusD01(){
        Assert.assertEquals(auto_getAttribute(DO1_BUTTON_XPATH,"class"),"button disabled");
    }

    public void clickDO2Button(){
        auto_setClickElement(DO2_BUTTON_XPATH);
    }

    public void verifyStatusD02(){
        Assert.assertEquals(auto_getAttribute(DO2_BUTTON_XPATH,"class"),"button disabled");
    }
}
