package com.basti12354.activityvsfragment;

import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.matcher.ViewMatchers.withId;


/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule
            = new ActivityTestRule<>(MainActivity.class);



    @Test
    public void testFragment() {
        onView(withId(R.id.fragmentBtn)).perform(ViewActions.click());
        onView(withId(R.id.nextBtn)).perform(ViewActions.click());
        onView(withId(R.id.nextBtn)).perform(ViewActions.click());
        onView(withId(R.id.nextBtn)).perform(ViewActions.click());
        pressBack();
        pressBack();
        pressBack();
    }

    @Test
    public void testActivity() {
        onView(withId(R.id.activityBtn)).perform(ViewActions.click());
        onView(withId(R.id.nextBtn)).perform(ViewActions.click());
        onView(withId(R.id.nextBtn)).perform(ViewActions.click());
        onView(withId(R.id.nextBtn)).perform(ViewActions.click());
        pressBack();
        pressBack();
        pressBack();
    }
}
