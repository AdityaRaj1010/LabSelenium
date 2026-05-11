package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {

    public static void main(String[] args) {

        System.setProperty(
            "webdriver.chrome.driver",
            "/usr/local/bin/chromedriver"
        );

        ChromeOptions options = new ChromeOptions();

        options.setBinary("/usr/bin/google-chrome");

        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");

	options.addArguments("--user-data-dir=/tmp/chrome-user-data");
	options.addArguments("--data-path=/tmp/chrome-data");
	options.addArguments("--disk-cache-dir=/tmp/chrome-cache");
        WebDriver driver = new ChromeDriver(options);

try {

    driver.get("https://www.saucedemo.com/");

    driver.findElement(By.id("user-name"))
          .sendKeys("standard_user");

    driver.findElement(By.id("password"))
          .sendKeys("secret_sauce");

    driver.findElement(By.id("login-button"))
          .click();

    System.out.println("Login Successful");

} finally {

    driver.quit();
}
    }
}
