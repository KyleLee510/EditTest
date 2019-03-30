package com.example.demoapplication;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.util.Log;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class Main2ActivityTest {

    @Rule
    public ActivityTestRule<Main2Activity> activityTestRule = new ActivityTestRule<>(Main2Activity.class);
    private Main2Activity main2Activity = null;

    @Test
    public void onCreate() {
        Log.d("TAG", "onCreate()");
    }

    @Test
    public void getEditTextToast() {
        Log.d("TAG", "getEditTextToast()");
    }

    @Before
    public void setUp() throws Exception {
        main2Activity = activityTestRule.getActivity();
    }

    @After
    public void tearDown() throws Exception {
    }



    @Test
    public void testClickButton() {
        //Espresso.onView(withId(R.id.Toast_Edit));
        Espresso.onView(withId(R.id.second_Button)).perform(click());
    }
}