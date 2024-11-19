package StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import utils.DriverManager;

public class Hooks {
    @Before
    public void setup() {
        System.out.println("Setting up WebDriver...");
        DriverManager.getDriver(); // Initializes WebDriver
    }

    @After
    public void teardown() {
        System.out.println("Tearing down WebDriver...");
        DriverManager.quitDriver(); // Quits WebDriver
    }
}