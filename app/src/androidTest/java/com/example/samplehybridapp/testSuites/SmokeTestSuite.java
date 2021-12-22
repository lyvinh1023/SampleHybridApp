package com.example.samplehybridapp.testSuites;

import com.example.samplehybridapp.categories.SmokeTest;
import com.example.samplehybridapp.tests.DashboardTests;
import com.example.samplehybridapp.tests.HomeTests;
import com.example.samplehybridapp.tests.NotificationsTests;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(SmokeTest.class)
@Suite.SuiteClasses({DashboardTests.class, HomeTests.class, NotificationsTests.class})
public class SmokeTestSuite {
}
