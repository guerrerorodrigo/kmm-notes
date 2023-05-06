import kotlinx.coroutines.InternalCoroutinesApi
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.rgb
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable

@InternalCoroutinesApi
fun main() {

    renderComposable(rootElementId = "root") {
        Style(TextStyles)

        Div(attrs = { style { padding(16.px) } }) {
            H1(attrs = { classes(TextStyles.titleText) }) {
                Text("KMM!")
            }
        }
    }
}

object TextStyles : StyleSheet() {

    val titleText by style {
        color(rgb(23,24, 28))
        fontSize(50.px)
        property("font-size", 50.px)
        property("letter-spacing", (-1.5).px)
        property("font-weight", 900)
        property("line-height", 58.px)

        property(
            "font-family",
            "Gotham SSm A,Gotham SSm B,system-ui,-apple-system,BlinkMacSystemFont,Segoe UI,Roboto,Oxygen,Ubuntu,Cantarell,Droid Sans,Helvetica Neue,Arial,sans-serif"
        )
    }
}
