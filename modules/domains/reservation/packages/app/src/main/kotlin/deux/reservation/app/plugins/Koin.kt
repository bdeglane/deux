package deux.reservation.app.plugins

import deux.reservation.reservationModule
import io.ktor.server.application.Application
import io.ktor.server.application.install
import org.koin.ktor.plugin.Koin
import org.koin.logger.slf4jLogger

fun Application.configureKoin() {
    install(Koin) {
        slf4jLogger()
        modules(
            listOf(
                reservationModule
            )
        )
    }
}
