package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestAddressPage {
    public static final Target INPUT_CITY = Target.the("where the city is selected")
            .located(By.id("city"));
    public static final Target INPUT_CODE = Target.the("where the postal code is selected")
            .located(By.id("zip"));
    public static final Target INPUT_COUNTRY = Target.the("where the country is selected")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]/font/font"));
    public static final Target INPUT_NEXT = Target.the("where next is selected")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
}
