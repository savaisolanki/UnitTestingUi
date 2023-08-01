package com.example.kotlinfundamentalapplication

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get:Rule

    val activityScenarioRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun submit_button_result() {
        onView(withId(R.id.edTittle)).perform(typeText("Savai"))
        onView(withId(R.id.edDescription)).perform(
            typeText("Savai Solanki is hero"), closeSoftKeyboard()
        )

        onView(withId(R.id.btnSubmit)).perform(click())
        onView(withId(R.id.tvTittle)).check(matches(withText("Savai")))

        onView(withId(R.id.tvDescription)).check(matches(withText("Savai Solanki is hero")))

    }
}