package tests.telecomunication.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.MobileReplenishmentTestDate.*;
import static constants.Constant.Urls.MOBILE_PAYMENT_URL;


public class MobilePhoneReplenishmentPositiveTest extends BaseTest {

    @Test
    public void checkIsRedirectToAuth() {
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneReplenishmentPage.selectCardFromWallet();
        basePage.isAuthWidgetPresent();
    }

    @Test
    public void checkMinimumReplenishmentAmount() {
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneReplenishmentPage
                .enterPoneNumber(MOBILE_PAYMENT_PONE_NUMBER)
                .enterAmount("1")
                .enterCardFrom(MOBILE_PAYMENT_CARD)
                .enterCardExpDate(MOBILE_PAYMENT_CARD_EXP_DATE)
                .enterCVV(MOBILE_PAYMENT_CARD_CVV)
                .enterName(MOBILE_PAYMENT_NAME)
                .enterLastName(MOBILE_PAYMENT_LAST_NAME)
                .submitToTheCard();
    }
}
