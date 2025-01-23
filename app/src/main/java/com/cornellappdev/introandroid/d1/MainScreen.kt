package com.cornellappdev.introandroid.d1

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        EateryCard(
            eateryName = "McDonalds",
            eateryLocation = "San Francisco",
            open = true,
            eateryColor = Color.Red
        )
    }
}
