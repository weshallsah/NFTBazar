package com.example.nftbazar.Component


import Homeview
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ButtomNav() {
    Box(
        modifier = Modifier.fillMaxWidth(),
        content = {
//            Homeview()
            
            BottomAppBar(
                modifier = Modifier
                    .padding(0.dp)
                    .align(Alignment.BottomCenter)
                    .height(80.dp)
                    .fillMaxWidth()
            ) {
                NavigationBarItem(selected = true, onClick = {
                }, icon = {
                    Row {
                        Icon(Icons.Filled.Home, contentDescription = "Home")
                        Text(
                            text = "Home",
                            modifier = Modifier.padding(vertical = 4.dp),
                            textAlign = TextAlign.Center,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                })
            }
        }
    )
}