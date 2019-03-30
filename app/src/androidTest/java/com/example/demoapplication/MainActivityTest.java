package com.example.demoapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class MainActivityTest  {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);
    private MainActivity mainActivity = null;

    @Before
    public void setUp() throws Exception {
        mainActivity = activityTestRule.getActivity();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void onCreate() {
        Log.d("TAG", "onCreate()");
    }

    @Test
    public  void goto2Activity() {
        Log.d("TAG", "goto2Activity()");
    }

    @Test
    public void testClickButton() {
        Espresso.onView(withId(R.id.first_Button)).perform(click());
    }

}