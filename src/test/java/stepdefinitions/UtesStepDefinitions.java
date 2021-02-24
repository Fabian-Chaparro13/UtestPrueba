package stepdefinitions;




import questions.Answer;
import tasks.Confirmation;
import tasks.Login;
import tasks.OpenUp;
import org.junit.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.UtestData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtesStepDefinitions {

    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast());}

    @Given("^than fabian wants to login in page Utest$")
    public void thanFabianWantsLoginInPageUtest (List<UtestData> utestData) throws Exception {
        OnStage.theActorCalled("fabian").wasAbleTo(OpenUp.thePage(), Login.
                onThePage(utestData.get(0).getStrName(), utestData.get(0).getStrLastName(), utestData.get(0).getStrEmail()));
    }
    @When("^he performs password confirmation$")
        public void hePerformPasswordConfirmation (List<UtestData> utestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Confirmation.toThePage(utestData.get(0).getStrPassword(), utestData.get(0).getStrPassword1(), utestData.get(0).getStrRegister()));

    }
    @Then("^he performs configuration completed of user creation$")
        public void hePerformsConfigurationCompletedOfUserCreation (List<UtestData> utestData) throws Exception {
            OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestData.get(0).getStrRegister())));

    }
}
