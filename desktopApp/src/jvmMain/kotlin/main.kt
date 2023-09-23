import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        MainView()
        IconButton(
            onClick = {
            }
        ) {
            Icon(
                painter = painterResource("ic_refresh.svg"),
                contentDescription = "Refresh"
            )

        }
    }
}
