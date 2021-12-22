package com.example.samplehybridapp.tests;

import com.example.samplehybridapp.pages.NotificationsPage;
import com.example.samplehybridapp.categories.RegressionTest;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class NotificationsTests extends BaseTests {

    NotificationsPage notificationsPage = new NotificationsPage();

    @Category(RegressionTest.class)
    @Test
    public void openNotificationsTest() {
        notificationsPage.clickView(notificationsPage.navigationNotificationsId);
        notificationsPage.checkViewDisplayWithText(notificationsPage.navigationNotificationsText);
    }
}
