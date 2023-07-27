package deux.reservation.app.plugins

import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.resources.Resources

fun Application.configureServerResources() {
    install(Resources)
}
