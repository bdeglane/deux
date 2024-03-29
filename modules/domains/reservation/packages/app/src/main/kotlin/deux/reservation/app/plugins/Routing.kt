package deux.reservation.app.plugins

import deux.reservation.reservation
import io.ktor.server.application.*
import io.ktor.server.plugins.openapi.openAPI
import io.ktor.server.plugins.swagger.swaggerUI
import io.ktor.server.response.respondText
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }

        reservation()

        swaggerUI(path = "swagger", swaggerFile = "openapi/documentation.yaml")
        openAPI(path="openapi", swaggerFile = "openapi/documentation.yaml")
    }
}
