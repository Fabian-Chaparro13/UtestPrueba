package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.UtestDecivesPage;

public class Decives implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(UtestDecivesPage.BUTTON_COMPUTER),
                Click.on(UtestDecivesPage.BUTTON_VERSION),
                Click.on(UtestDecivesPage.BUTTON_IDIOM),
                Click.on(UtestDecivesPage.BUTTON_MOBILE),
                Click.on(UtestDecivesPage.BUTTON_MODEL),
                Click.on(UtestDecivesPage.BUTTON_SYSTEM),
                Click.on(UtestDecivesPage.INPUT_NEXT));
    }
}
