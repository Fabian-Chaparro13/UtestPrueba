package userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestDecivesPage {
    public static final Target BUTTON_COMPUTER = Target.the("where the computer's operating system is selected")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/span[2]/font/font"));
    public static final Target BUTTON_VERSION = Target.the("where the operating system version is selected")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span/span[2]/font/font"));
    public static final Target BUTTON_IDIOM = Target.the("where the language is selected")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span/span[2]/font/font"));
    public static final Target BUTTON_MOBILE = Target.the("where the mobile device is selected")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target BUTTON_MODEL = Target.the("where the mobile device model is selected")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target BUTTON_SYSTEM = Target.the("where the operating system of the mobile device is selected")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span/span[2]"));
    public static final Target INPUT_NEXT = Target.the("where next is selected")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a/span/font/font"));
}
