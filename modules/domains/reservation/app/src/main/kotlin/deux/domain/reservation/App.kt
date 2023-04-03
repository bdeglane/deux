package deux.domain.reservation

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["deux.domain"])
@ConfigurationPropertiesScan(basePackages = ["deux.domain"])
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
