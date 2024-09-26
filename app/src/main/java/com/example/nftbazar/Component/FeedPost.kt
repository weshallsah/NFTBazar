package com.example.nftbazar.Component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nftbazar.R

@Composable
fun FeedPost() {
    Column(
        Modifier
            .fillMaxSize()
            .padding(vertical = 5.dp)
    ) {
        Row {
            Box(
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .height(60.dp)
                    .width(60.dp)
                    .clip(shape = CircleShape)
                    .border(
                        color = Color.Black,
                        width = 1.dp,
                        shape = CircleShape,
                    ),
//                                    .background(color = Color.Cyan),
                content = {
                    Image(
                        painter = painterResource(id = R.drawable.profileimage),
                        contentDescription = "Profile_Image"
                    )
                }
            )
            Text(
                modifier = Modifier
                    .padding(5.dp)
                    .align(alignment = Alignment.CenterVertically),
                text = "Weshallsah",
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold,
                overflow = TextOverflow.Ellipsis,
            )

        }
        Box(modifier = Modifier
            .padding(20.dp)
            .background(color = Color.Black, shape = RoundedCornerShape(25.dp))
            .offset(x = -6.dp, y = -6.dp),
            content = {
                Box(modifier = Modifier
                    .border(
                        color = Color.Black,
                        width = 1.dp,
                        shape = RoundedCornerShape(25.dp)
                    )
                    .clip(shape = RoundedCornerShape(25.dp)),
                    content = {
                        Image(
                            painter = painterResource(id = R.drawable.nft),
                            contentDescription = "post"
                        )
                    }
                )
            }
        )
        Row(
            Modifier
                .padding(horizontal = 15.dp)
        ) {
            IconButton(iconId = R.drawable.like)
            IconButton(iconId = R.drawable.comment)
            IconButton(iconId = R.drawable.share)
        }
        Text(
            text = "It is a long established fact that a reader will be distracted by the readable content of a page when hello",
            modifier = Modifier
                .padding(horizontal = 15.dp, vertical = 5.dp)
                .height(40.dp),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            overflow = TextOverflow.Ellipsis,
            fontFamily = FontFamily.Default,
            textAlign = TextAlign.Justify,
        )
    }
}