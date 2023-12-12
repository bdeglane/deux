package deux.bff

import deux.bff.plugins.configureContentNegotiation
import deux.bff.plugins.configureCors
import deux.bff.plugins.configureHTTP
import deux.bff.plugins.configureRouting
import deux.bff.plugins.configureSecurity
import deux.bff.plugins.configureSerialization
import io.ktor.server.application.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    configureSecurity()
    configureHTTP()
    configureSerialization()
    configureRouting()
    configureContentNegotiation()
    configureCors()
}
