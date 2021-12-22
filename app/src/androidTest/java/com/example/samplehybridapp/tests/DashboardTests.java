package com.example.samplehybridapp.tests;

import com.example.samplehybridapp.pages.DashboardPage;
import com.example.samplehybridapp.categories.RegressionTest;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class DashboardTests extends BaseTests {

    DashboardPage dashboardPage = new DashboardPage();

    @Category(RegressionTest.class)
    @Test
    public void openDashboardTest() {
        dashboardPage.clickView(dashboardPage.navigationDashboardId);
        dashboardPage.checkViewDisplayWithText(dashboardPage.navigationDashboardText);
    }
}
