package com.example.samplehybridapp.tests;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.samplehybridapp.R;
import com.example.samplehybridapp.pages.HomePage;
import com.example.samplehybridapp.categories.RegressionTest;
import com.example.samplehybridapp.annotations.SmokeAnnotation;
import com.example.samplehybridapp.categories.SmokeTest;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class HomeTests extends BaseTests{

    HomePage homePage = new HomePage();

    @Category({RegressionTest.class, SmokeTest.class})
    @SmokeAnnotation
    @Test
    public void navigationBarTest() {
        homePage.checkViewDisplay(R.id.navigation_home);
        homePage.checkViewDisplay(R.id.navigation_dashboard);
        homePage.checkViewDisplay(R.id.navigation_notifications);
    }

    @Category({RegressionTest.class, SmokeTest.class})
    @SmokeAnnotation
    @Test
    public void loginWebViewTest() throws InterruptedException {
        homePage.loginWebView("test", "password");
        homePage.verifyHomePage();
    }
}
