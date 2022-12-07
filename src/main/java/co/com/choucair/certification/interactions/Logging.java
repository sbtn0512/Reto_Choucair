package co.com.choucair.certification.interactions;

import co.com.choucair.certification.userinterfaces.InitialPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.certification.userinterfaces.InitialPage.BUTTON_SIGN_IN;
import static co.com.choucair.certification.utils.Constants.PASSWORD;
import static co.com.choucair.certification.utils.Constants.USERNAME;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Logging implements Interaction {
    public static Logging thePage() {
        return instrumented(Logging.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(USERNAME).into(InitialPage.USERNAME),
                Enter.theValue(PASSWORD).into(InitialPage.PASSWORD),
                Click.on(BUTTON_SIGN_IN)
        );
    }
}
