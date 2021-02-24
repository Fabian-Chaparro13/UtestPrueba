package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestConfirmationPage {
    public static final Target INPUT_PASSWORD = Target.the("where the city is selected")
            .located(By.id("password"));
    public static final Target INPUT_PASSWORD1 = Target.the("where the postal code is selected")
            .located(By.id("confirmPassword"));
    public static final Target ENTER_TERMS = Target.the("where the country is selected")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target ENTER_POLITICS = Target.the("where next is selected")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target ENTER_COMPLETE = Target.the("where next is selected")
            .located(By.xpath("//*[@id=\"laddaBtn\"]/span/font/font"));
    public static final Target INPUT_REGISTER = Target.the("where next is selected")
            .located(By.id("//*[contains(text(), 'Configuración completa'"));
}

