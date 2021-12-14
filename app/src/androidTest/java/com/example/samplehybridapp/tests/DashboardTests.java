package com.example.samplehybridapp.tests;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.samplehybridapp.pages.DashboardPage;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class DashboardTests extends BaseTests {

    DashboardPage dashboardPage = new DashboardPage();

    @Test
    public void openDashboardTest() {
        dashboardPage.clickView(dashboardPage.navigationDashboardId);
        dashboardPage.checkViewDisplayWithText(dashboardPage.navigationDashboardText);
    }
}
