import androidx.compose.animation.core.animateOffsetAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nftbazar.R


@Composable
fun Splashview(navController: NavController) {
    var isclicked by remember {
        mutableStateOf(false)
    };
    val start = Offset(x = 0f, y = 0f);
    val end = Offset(x = 5f, y = 5f);
    val buttonanimate by animateOffsetAsState(
        targetValue = if (isclicked) end
        else start,
        finishedListener = {
            isclicked = false;
            navController.navigate("Home")
        }
    );
    Box(
        modifier = Modifier
            .fillMaxSize(),
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 30.dp),
            ) {
                Row(
                    modifier = Modifier
                        .height(80.dp)
                        .fillMaxSize(),
                ) {

                }
                Box(
                    modifier = Modifier
                        .height(370.dp)
                        .width(250.dp)
                        .align(Alignment.CenterHorizontally),
                ) {
                    card(-15f)
                    card(15f)
                    card(0f)
                    Box(
                        modifier = Modifier
                            .height(50.dp)
                            .width(150.dp)
                            .fillMaxSize()
                            .align(Alignment.BottomCenter)
                            .background(
                                color = Color.Black,
                                shape = RoundedCornerShape(15.dp),
                            )
                            .offset(y = -5.dp, x = -5.dp),
                        content = {
                            Box(
                                modifier = Modifier
                                    .height(50.dp)
                                    .width(150.dp)
                                    .border(
                                        color = Color.Black,
                                        width = 1.dp,
                                        shape = RoundedCornerShape(15.dp),
                                    )
                                    .clip(shape = RoundedCornerShape(15.dp))
                                    .background(
                                        color = Color(
                                            red = 219,
                                            blue = 0,
                                            green = 253,
                                        )
                                    )
                                    .align(Alignment.BottomCenter),
                            ) {
                                Text(
                                    text = "1.1 ETC",
                                    fontSize = 24.sp,
                                    fontWeight = FontWeight.Bold,
                                    textAlign = TextAlign.Center,
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(vertical = 10.dp),
                                )
                            }
                        }
                    )
                }
                Row(
                    modifier = Modifier
                        .height(80.dp)
                        .fillMaxSize(),
                ) {

                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
//                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Buy ",
                        fontSize = 40.sp,
                        fontWeight = FontWeight.Light
                    )
                    Text(
                        text = "Random NFT",
                        fontSize = 40.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
//                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Packs, ",
                        fontSize = 40.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Text(
                        text = "Broaden",
                        fontSize = 40.sp,
                        fontWeight = FontWeight.Light
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
//                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Your ",
                        fontSize = 40.sp,
                        fontWeight = FontWeight.Light
                    )
                    Box(
                        modifier = Modifier.width(200.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .height(20.dp)
                                .width(100.dp)
                                .background(
                                    color = Color(
                                        red = 219,
                                        blue = 0,
                                        green = 253,
                                    )
                                )
                                .align(Alignment.BottomEnd)
                        )
                        Text(
                            text = "Collection",
                            fontSize = 40.sp,
                            fontWeight = FontWeight.ExtraBold,
                        )
                    }
                }
                Box(
                    modifier = Modifier
                        .padding(vertical = 50.dp)
                        .height(70.dp)
                        .width(200.dp)
                        .background(
                            color = Color.Black,
                            shape = RoundedCornerShape(15.dp)
                        )
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally)
                        .offset(x = -5.dp, y = -5.dp),
                    content = {
                        Box(
                            modifier = Modifier
                                .offset(x = buttonanimate.x.dp, y = buttonanimate.y.dp)
                                .fillMaxSize()
                                .background(
                                    color = Color(
                                        red = 219,
                                        blue = 0,
                                        green = 253,
                                    ),
                                    shape = RoundedCornerShape(15.dp)
                                )
                                .border(
                                    width = 1.dp,
                                    color = Color.Black,
                                    shape = RoundedCornerShape(15.dp)
                                )
                                .clip(RoundedCornerShape(15.dp))
                                .clickable {
                                    isclicked = true;
                                },
                            content = {
                                Text(
                                    modifier = Modifier
                                        .padding(vertical = 10.dp)
                                        .fillMaxSize(),
                                    text = "Next",
                                    textAlign = TextAlign.Center,
                                    fontSize = 30.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        )
                    }
                )
            }
        }
    )
}

@Composable
fun card(degree: Float) {
    Box(
        modifier = Modifier
            .rotate(degrees = degree)
            .fillMaxSize()
            .padding(vertical = 25.dp)
            .background(
                color = Color.Black,
                shape = RoundedCornerShape(25.dp),
            )
            .offset(y = -5.dp, x = -5.dp),
    ) {
        Box(
            modifier = Modifier
                .border(
                    width = 1.dp,
                    shape = RoundedCornerShape(25.dp),
                    color = Color.Black
                )
                .fillMaxSize()
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(25.dp),
                ),
            content = {
                Column {
                    Box(
                        modifier = Modifier
                            .padding(10.dp)
                            .border(
                                width = 1.dp,
                                shape = RoundedCornerShape(18.dp),
                                color = Color.Black,
                            )
                            .height(230.dp)
                            .width(250.dp)
                            .background(
                                color = Color.White,
                                shape = RoundedCornerShape(18.dp)
                            )
                            .clip(shape = RoundedCornerShape(18.dp)),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.nft),
                            contentDescription = "",
                            alignment = Alignment.Center,

                            )
                    }
                    Row(
                        modifier = Modifier
                            .padding(horizontal = 15.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ) {
                        Text(
                            text = "Vishal sah",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                        )
                        Text(
                            text = "15h:35m:08s",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                    Row(
                        modifier = Modifier
                            .padding(horizontal = 15.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ) {
                        Text(
                            text = "@weshallsah",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                        )
                        Text(
                            text = "Time Remaining",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                }
            }
        )
    }
}

