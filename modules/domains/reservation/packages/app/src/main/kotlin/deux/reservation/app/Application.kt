package deux.reservation.app

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import deux.reservation.app.plugins.configureHTTP
import deux.reservation.app.plugins.configureKoin
import deux.reservation.app.plugins.configureRouting
import org.koin.dsl.module

fun main() {
    // val ctx = AnnotationConfigApplicationContext("deux.reservation.*")

    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    configureHTTP()
    configureKoin()
    configureRouting()
}

