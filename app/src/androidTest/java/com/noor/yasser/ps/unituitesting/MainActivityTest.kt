package com.noor.yasser.ps.unituitesting

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.statement.UiThreadStatement
import androidx.test.rule.ActivityTestRule
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @Rule
    @JvmField
    public var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun setUp() {
    }

    @Test
    fun recyclerViewTest() {

        mData.forEachIndexed { index, user ->
            Espresso.onView(ViewMatchers.withId(R.id.rcData))
                .perform(
                    RecyclerViewActions
                        .actionOnItemAtPosition<RecyclerView.ViewHolder>(
                            index,
                            ViewActions.click()
                        )
                )

        }
    }
}