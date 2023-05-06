import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.CanvasBasedWindow
import com.rodrigoguerrero.common.SharedText
import org.jetbrains.compose.resources.painterResource
import kotlin.wasm.unsafe.*

val appBlack: Color = Color(0xff25242b)
val appYellow: Color = Color(0xffffb400)
val appWhite: Color = Color(0xffffffff)

val LightThemeColors = lightColors(
    primary = appYellow,
    primaryVariant = appYellow,
    background = appWhite,
    secondary = appBlack
)

val DarkThemeColors = darkColors(
    primary = appYellow,
    primaryVariant = appYellow,
    background = appBlack,
    secondary = appWhite
)

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    CanvasBasedWindow {
        MaterialTheme(colors = if (isSystemInDarkTheme()) DarkThemeColors else LightThemeColors) {
            Scaffold(
                content = {
                    SharedText("Shared text wasm web!")
                },
            )
        }
    }
}
