package com.example.samplehybridapp.tests;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.samplehybridapp.R;
import com.example.samplehybridapp.pages.HomePage;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class HomeTests extends BaseTests{

    HomePage homePage = new HomePage();

    @Test
    public void navigationBarTest() {
        homePage.checkViewDisplay(R.id.navigation_home);
        homePage.checkViewDisplay(R.id.navigation_dashboard);
        homePage.checkViewDisplay(R.id.navigation_notifications);
    }

    @Test
    public void loginWebViewTest() throws InterruptedException {
        homePage.loginWebView("test", "password");
        homePage.verifyHomePage();
    }
}