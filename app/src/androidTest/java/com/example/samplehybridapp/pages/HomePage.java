package com.example.samplehybridapp.pages;

import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.web.assertion.WebViewAssertions.webMatches;
import static androidx.test.espresso.web.sugar.Web.onWebView;
import static androidx.test.espresso.web.webdriver.DriverAtoms.findElement;
import static androidx.test.espresso.web.webdriver.DriverAtoms.getText;
import static androidx.test.espresso.web.webdriver.DriverAtoms.webClick;
import static androidx.test.espresso.web.webdriver.DriverAtoms.webKeys;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

import androidx.test.espresso.web.webdriver.Locator;

import com.example.samplehybridapp.R;

public class HomePage extends BasePage {

    private final int homeWebViewId = R.id.home_webview;
    private final String usernameTxt = "username";
    private final String passwordTxt = "password";
    private final String loginButton = "//input[@value=\"login\"]";
    private final String homePageTitle = "Example Domain";

    public void loginWebView(String username, String password) throws InterruptedException {
        onWebView(withId(homeWebViewId)).forceJavascriptEnabled();
        onWebView()
                .withElement(findElement(Locator.NAME, usernameTxt))
                .perform(webKeys(username))
                .withElement(findElement(Locator.NAME, passwordTxt))
                .perform(webKeys(password))
                .withElement(findElement(Locator.XPATH, loginButton))
                .perform(webClick());
        Thread.sleep(5000);
    }

    public void verifyHomePage() {
        onWebView(withId(homeWebViewId)).forceJavascriptEnabled();
        onWebView()
                .withElement(findElement(Locator.XPATH, "//h1"))
                .check(webMatches(getText(), equalTo(homePageTitle)));
        onWebView()
                .withElement(findElement(Locator.XPATH, "//a"))
                .check(webMatches(getText(), containsString("More information")));
    }
}
