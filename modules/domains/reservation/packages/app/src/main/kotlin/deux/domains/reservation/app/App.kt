package deux.domains.reservation.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication(
    scanBasePackages = [
        "deux.domain.reservation"
    ]
)
@ConfigurationPropertiesScan(
    basePackages = [
        "deux.domain.reservation"
    ]
)
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
