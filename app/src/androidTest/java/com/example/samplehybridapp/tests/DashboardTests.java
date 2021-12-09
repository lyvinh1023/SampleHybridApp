package com.example.samplehybridapp.tests;

import com.example.samplehybridapp.pages.DashboardPage;
import org.junit.Test;

public class DashboardTests extends BaseTests {

    DashboardPage dashboardPage = new DashboardPage();

    @Test
    public void openDashboardTest() {
        dashboardPage.clickView(dashboardPage.navigationDashboardId);
        dashboardPage.checkViewDisplayWithText(dashboardPage.navigationDashboardText);
    }
}
