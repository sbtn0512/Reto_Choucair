package co.com.choucair.certification.stepdefinitions;

import co.com.choucair.certification.exceptions.FailedOrderException;
import co.com.choucair.certification.questions.GetData;
import co.com.choucair.certification.tasks.GoTo;
import co.com.choucair.certification.tasks.SaveThe;
import co.com.choucair.certification.userinterfaces.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.com.choucair.certification.utils.Constants.CHROME;
import static co.com.choucair.certification.utils.Constants.ERROR_SAVING_ORDER;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class OrderStepDefinitions {

    @Managed(driver = CHROME)
    WebDriver driver;

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) entered the section to enter a new order$")
    public void theAnalystEnteredTheSectionToEnterANewOrder(String name) {
        OnStage.theActorCalled(name);
        theActorInTheSpotlight().can(BrowseTheWeb.with(driver));
        theActorInTheSpotlight().wasAbleTo(Open.browserOn(new HomePage()),
                GoTo.orders());
    }

    @When("^you fill out the form$")
    public void youFillOutTheForm(DataTable dataOrder) {
        theActorInTheSpotlight().attemptsTo(SaveThe.newOrder(dataOrder));
    }

    @Then("the created order will be displayed on the screen$")
    public void theCreatedOrderWillBeDisplayedOnTheScreen() {
        theActorInTheSpotlight().should(seeThat(GetData.confirmationOrder()).
                orComplainWith(FailedOrderException.class,ERROR_SAVING_ORDER));
    }
}