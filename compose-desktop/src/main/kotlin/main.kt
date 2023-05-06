import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.rodrigoguerrero.common.SharedText

fun main() = application {
    val windowState = rememberWindowState()

    Window(
        onCloseRequest = ::exitApplication,
        state = windowState,
        title = "KMM!"
    ) {

        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            SharedText(text = "Shared Text Desktop!!")
        }
    }
}
