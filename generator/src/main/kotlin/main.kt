import io.github.wulkanowy.messages.pojo.Message
import io.github.wulkanowy.messages.pojo.MessageType
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.File

val messages = listOf(
    Message(
        id = 1,
        title = "Problemy z zadaniami domowymi",
        content = "Występują problemy z zadaniami domowymi. Zaktualizuj aplikację!",
        type = MessageType.DASHBOARD_MESSAGE,
    )
)

fun main() {
    val json = Json.encodeToString(messages)
    File("../dist/messages.json").writeText(json)
}
