package com.example.samplehybridapp.tests;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.samplehybridapp.pages.NotificationsPage;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class NotificationsTests extends BaseTests {

    NotificationsPage notificationsPage = new NotificationsPage();

    @Test
    public void openNotificationsTest() {
        notificationsPage.clickView(notificationsPage.navigationNotificationsId);
        notificationsPage.checkViewDisplayWithText(notificationsPage.navigationNotificationsText);
    }
}
