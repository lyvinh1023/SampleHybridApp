package com.example.samplehybridapp.pages;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.matcher.ViewMatchers;

import com.example.samplehybridapp.R;

public class BasePage {
    public void clickView(int viewId) {
        onView(ViewMatchers.withId(viewId))
                .perform(click());
    }

    public void checkViewDisplay(int viewId) {
        onView(ViewMatchers.withId(viewId))
                .check(matches(isDisplayed()));
    }

    public void checkViewDisplayWithText(String viewText) {
        onView(withText(viewText)).check(matches(isDisplayed()));
    }
}
