package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.UtestAddressPage;

public class Address implements Task {
    private String city;
    private String code;


    public Address(String city, String code) {
        this.city = city;
        this.code = code;


    }

    public static Address the(String city, String code) {
        return Tasks.instrumented(Address.class, city, code);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(city).into(UtestAddressPage.INPUT_CITY),
                Enter.theValue(code).into(UtestAddressPage.INPUT_CODE),
                Click.on(UtestAddressPage.INPUT_COUNTRY),
                Click.on(UtestAddressPage.INPUT_NEXT));
    }
}
