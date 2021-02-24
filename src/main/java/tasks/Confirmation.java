package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.UtestConfirmationPage;

public class Confirmation implements Task {

    private String strPassword;
    private String strPassword1;
    private String strRegister;

    public Confirmation (String strPassword, String strPassword1, String strRegister){
        this.strPassword = strPassword;
        this.strPassword1 = strPassword1;
        this.strRegister = strRegister;
    }

    public static Confirmation toThePage(String strPassword, String strPassword1, String strRegister) {
        return Tasks.instrumented(Confirmation.class,strPassword,strPassword1,strRegister);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(strPassword).into(UtestConfirmationPage.INPUT_PASSWORD),
                Enter.theValue(strPassword1).into(UtestConfirmationPage.INPUT_PASSWORD1),
                Click.on(UtestConfirmationPage.ENTER_TERMS),
                Click.on(UtestConfirmationPage.ENTER_POLITICS),
                Click.on(UtestConfirmationPage.ENTER_COMPLETE),
                Enter.theValue(strRegister).into(UtestConfirmationPage.INPUT_REGISTER));

    }
}
