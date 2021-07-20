package pages.telecomunications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class MobilePhoneReplenishmentPage extends BasePage {

    public MobilePhoneReplenishmentPage(WebDriver driver) {
        super(driver);
    }

    private final By buttonWallet = By.xpath("//div[contains(text(), 'My wallet')]");
    private final By inputPhoneNumber = By.xpath("//input[@data-qa-node='phone-number']");
    private final By inputAmount = By.xpath("//input[@data-qa-node='amount']");
    private final By buttonSubmitToTheCard = By.xpath("//button[@data-qa-node='submit']");
    private final By inputCardFrom = By.xpath("//input[@data-qa-node='numberdebitSource']");
    private final By inputCardExpDate = By.xpath("//input[@data-qa-node='expiredebitSource']");
    private final By inputCardCVV = By.xpath("//input[@data-qa-node='cvvdebitSource']");
    private final By inputName = By.xpath("//input[@data-qa-node='firstNamedebitSource']");
    private final By inputLastName = By.xpath("//input[@data-qa-node='lastNamedebitSource']");

    /**
     * Choose the card from the wallet
     * */
    public MobilePhoneReplenishmentPage selectCardFromWallet() {
        driver.findElement(buttonWallet).click();
        return this;
    }

    /**
     * Enter phone number excluding country code
     * @param number phone
     * */
    public MobilePhoneReplenishmentPage enterPoneNumber(String number) {
        driver.findElement(inputPhoneNumber).sendKeys(number);
        return this;
    }

    /**
     *Enter the payment amount
     * @param amount payment
     * */
    public MobilePhoneReplenishmentPage enterAmount(String amount) {
        driver.findElement(inputAmount).sendKeys(amount);
        return this;
    }

    /**
     *Enter card number
     * @param card number
     * */
    public MobilePhoneReplenishmentPage enterCardFrom(String card) {
        driver.findElement(inputCardFrom).sendKeys(card);
        return this;
    }

    /**
     *Enter validation term card
     * @param expDate validation term
     * */
    public MobilePhoneReplenishmentPage enterCardExpDate(String expDate) {
        driver.findElement(inputCardExpDate).sendKeys(expDate);
        return this;
    }

    /**
     *Enter CVV
     * @param cvv card
     * */
    public MobilePhoneReplenishmentPage enterCVV(String cvv) {
        driver.findElement(inputCardCVV).sendKeys(cvv);
        return this;
    }

    /**
     *Enter name card owner
     * @param name card owner
     * */
    public MobilePhoneReplenishmentPage enterName(String name) {
        driver.findElement(inputName).sendKeys(name);
        return this;
    }

    /**
     *Enter last name card owner
     * @param lastName name card owner
     * */
    public MobilePhoneReplenishmentPage enterLastName(String lastName) {
        driver.findElement(inputLastName).sendKeys(lastName);
        return this;
    }

    /**
     *Click "To the card" and submit operation
     * */
    public MobilePhoneReplenishmentPage submitToTheCard() {
        driver.findElement(buttonSubmitToTheCard).click();
        return this;
    }

}
