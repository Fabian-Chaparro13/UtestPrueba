package tasks;

import userinterface.UtestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    private String strName;
    private String strLastName;
    private String strEmail;

    public Login (String strName, String strLastName, String strEmail){
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
    }
    public static Login onThePage(String strName, String strLastName, String strEmail){
        return Tasks.instrumented(Login.class,strName,strLastName,strEmail);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestLoginPage.LOGIN_BUTTON),
                Enter.theValue(strName).into(UtestLoginPage.INPUT_NAME),
                Enter.theValue(strLastName).into(UtestLoginPage.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(UtestLoginPage.INPUT_EMAIL),
                Click.on(UtestLoginPage.INPUT_MONTH),
                Click.on(UtestLoginPage.INPUT_DAY),
                Click.on(UtestLoginPage.INPUT_YEAR),
                Click.on(UtestLoginPage.INPUT_NEXT));
    }
}
