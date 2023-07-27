package deux.reservation.app.plugins

import io.ktor.server.application.*
import io.ktor.server.application.Application
import io.ktor.server.plugins.requestvalidation.RequestValidation

fun Application.configureRequestValidation() {
    install(RequestValidation)
}
