package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.Driver;

public class FindPage {

    @Given("page loads correctly")
    public void page_loads_correctly() {
        Driver.GetDriver().get("https://www.google.com");
    }

    @Then("return spoiler items")
    public void return_spoiler_items() {
        Assert.assertEquals("https://www.google.com/", Driver.GetDriver().getCurrentUrl());
    }
}
