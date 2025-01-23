package com.cornellappdev.introandroid.d1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement.SpaceBetween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun EateryCard(
    eateryColor: Color,
    eateryName: String,
    eateryLocation: String,
    paymentTypes: List<String> = listOf("USD", "CAD"),
    open: Boolean,
) {
    Surface(
        shape = RoundedCornerShape(12.dp),
        shadowElevation = 4.dp,
        modifier = Modifier
            .fillMaxWidth()
            .height(220.dp)
    ) {
        Column {
            Box(modifier = Modifier
                .weight(1f)
                .background(color = eateryColor)
                .fillMaxWidth())
            Box(modifier = Modifier
                .weight(1f)
                .fillMaxWidth()) {
                Column(
                    modifier = Modifier.padding(16.dp).fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = SpaceBetween
                    ) {
                        Text(
                            text = eateryName,
                            fontSize = 24.sp
                        )

                        if (open) {
                            Text(
                                text = "Open",
                                fontSize = 16.sp,
                                color = Color.Green,
                                fontWeight = FontWeight(500)
                            )
                        } else {
                            Text(
                                text = "Closed",
                                fontSize = 16.sp,
                                color = Color.Red,
                                fontWeight = FontWeight(500)
                            )
                        }
                    }

                    Text(
                        text = eateryLocation,
                        fontSize = 16.sp
                    )

                    Text(
                        text = "Accepts: ${ paymentTypes.joinToString() }",
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun EateryCardPreview() {
    EateryCard(
        eateryName = "McDonalds",
        eateryLocation = "San Francisco",
        open = true,
        eateryColor = Color.Red
    )
}
