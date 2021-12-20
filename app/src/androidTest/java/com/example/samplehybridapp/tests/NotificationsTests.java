package com.example.samplehybridapp.tests;

import com.example.samplehybridapp.pages.NotificationsPage;
import org.junit.Test;

public class NotificationsTests extends BaseTests {

    NotificationsPage notificationsPage = new NotificationsPage();

    @Test
    public void openNotificationsTest() {
        notificationsPage.clickView(notificationsPage.navigationNotificationsId);
        notificationsPage.checkViewDisplayWithText(notificationsPage.navigationNotificationsText);
    }
}
