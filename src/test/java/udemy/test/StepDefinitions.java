package udemy.test;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    @Given("an example scenario")
    public void anExampleScenario() {
        System.out.println("1 an example scenario");
    }

    @When("all step definitions are implemented")
    public void  allStepDefinitionsAreImplemented() {
        System.out.println("2 all step definitions are implemented");
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
        System.out.println("3 the scenario passes");
    }

}
