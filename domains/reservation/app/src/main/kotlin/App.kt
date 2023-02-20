package reservation.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
// @ConfigurationPropertiesScan("reservation.app.modules.ReservationModule")
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
