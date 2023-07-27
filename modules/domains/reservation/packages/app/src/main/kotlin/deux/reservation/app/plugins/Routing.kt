package deux.reservation.app.plugins

import deux.reservation.reservation
import io.ktor.server.application.*
import io.ktor.server.response.respondText
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        reservation()

        get("/") {
            call.respondText("Hello World!")
        }
    }
}
