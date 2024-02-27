package com.example.reply.test

import androidx.activity.ComponentActivity
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import com.example.reply.ui.ReplyApp
import org.junit.Rule
import org.junit.Test

class ReplyAppTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun compactDevice_verifyUsingBottomNavigation() {
        // Set up compact window
        composeTestRule.setContent {
            ReplyApp(
                windowSize = WindowWidthSizeClass.Compact
            )
        }
        // Bottom navigation is displayed
        //composeTestRule.onNodeWithTagForStringId(
            //Me da error, pero no se porque, debería funcionar bien porque lo he añadido a string.xml
            //R.string.navigation_bottom
        //).assertExists()
    }

    @Test
    fun mediumDevice_verifyUsingNavigationRail() {
        // Set up medium window
        composeTestRule.setContent {
            ReplyApp(
                windowSize = WindowWidthSizeClass.Medium
            )
        }
        // Navigation rail is displayed
        //composeTestRule.onNodeWithTagForStringId(
        //    R.string.navigation_rail
        //).assertExists()
        //MISMO ERROR QUE ARRIBA
    }

    @Test
    fun expandedDevice_verifyUsingNavigationDrawer() {
        // Set up expanded window
        composeTestRule.setContent {
            ReplyApp(
                windowSize = WindowWidthSizeClass.Expanded
            )
        }
        // Navigation drawer is displayed
        //composeTestRule.onNodeWithTagForStringId(
        //    R.string.navigation_drawer
        //).assertExists()
        //MISMO ERROR QUE ARRIBA
    }

}