import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.nftbazar.Component.FeedPost


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Homeview(navController: NavController) {

    Box(
        modifier = Modifier.fillMaxSize(),
        content = {
            Column {
                TopAppBar(
                    title = {
                        Text(text = "NFTBazar")
                    }
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
//                        .background(color = Color.Red),
                ) {
                    LazyColumn {
                        items(count = 2) { index: Int ->
                            FeedPost()
                        }
                    }
                }
            }
        }
    )
}

