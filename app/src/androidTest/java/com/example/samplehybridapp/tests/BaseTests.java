package com.example.samplehybridapp.tests;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import com.example.samplehybridapp.MainActivity;

import org.junit.Rule;

public class BaseTests {
    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule = new ActivityScenarioRule<>(MainActivity.class);
}
