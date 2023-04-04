package deux.reservation

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["deux.reservation"])
@ConfigurationPropertiesScan(basePackages = ["deux.reservation"])
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
