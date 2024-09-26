package com.example.nftbazar.Component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun IconButton(iconId: Int) {
    Box(
        modifier = Modifier
            .padding(5.dp)
            .height(40.dp)
            .width(40.dp)
            .background(
                color = Color.Black,
                shape = RoundedCornerShape(10.dp)
            )
            .offset(x = -4.dp, y = -4.dp),
        content = {
            Box(
                modifier = Modifier
                    .height(40.dp)
                    .width(40.dp)
                    .background(
                        color = Color(
                            red = 219,
                            blue = 0,
                            green = 253,
                        ),
                        shape = RoundedCornerShape(10.dp)
                    )
                    .border(
                        color = Color.Black,
                        width = 1.dp,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(5.dp),
                content = {
                    Icon(
                        painter = painterResource(id = iconId),
                        modifier = Modifier
                            .height(30.dp)
                            .width(30.dp),
                        contentDescription = "Like_Button"
                    )
                }
            )
        }
    )
}


