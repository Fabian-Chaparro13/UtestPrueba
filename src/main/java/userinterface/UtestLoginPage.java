package userinterface;



import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestLoginPage {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to register")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target INPUT_NAME = Target.the("where do we write the name")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("where we write the Last name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where we write the email")
            .located(By.id("email"));
    public static final Target INPUT_MONTH = Target.the("where we select the month ")
            .located(By.xpath("//*[@id=\"birthMonth\"]/option[3]"));
    public static final Target INPUT_DAY = Target.the("where we select the day ")
            .located(By.xpath("//*[@id=\"birthDay\"]/option[11]"));
    public static final Target INPUT_YEAR = Target.the("where we select the year ")
            .located(By.xpath("//*[@id=\"birthYear\"]/option[12]"));
    public static final Target INPUT_NEXT = Target.the("where next is selected")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
}
