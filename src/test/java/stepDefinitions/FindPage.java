package stepDefinitions;

import io.cucumber.java.en.*;

public class FindPage {

    @Given("page loads correctly")
    public void page_loads_correctly() {
        System.out.println("found page");
    }

    @Then("return spoiler items")
    public void return_spoiler_items() {
        System.out.println("here are the things");
    }
}
