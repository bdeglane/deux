package deux.reservation.app

import deux.reservation.app.plugins.configureContentNegociation
import deux.reservation.app.plugins.configureHTTP
import deux.reservation.app.plugins.configureKoin
import deux.reservation.app.plugins.configureRequestValidation
import deux.reservation.app.plugins.configureRouting
import deux.reservation.app.plugins.configureServerResources
import io.ktor.server.application.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    configureHTTP()
    configureKoin()
    configureRouting()
    configureRequestValidation()
    configureContentNegociation()
    configureServerResources()
}
