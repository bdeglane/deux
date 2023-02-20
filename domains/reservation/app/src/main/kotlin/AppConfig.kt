package reservation.app

import endpoints.ReservationEndpoint
import infrastructures.ReservationInfrastructure
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import services.ReservationService

@Configuration
class AppConfig {

    @Bean
    fun reservationInfrastructure(): ReservationInfrastructure {
        return ReservationInfrastructure()
    }

    @Bean
    fun reservationService(reservationInfrastructure: ReservationInfrastructure): ReservationService {
        return ReservationService(reservationInfrastructure)
    }

    @Bean
    fun reservationEndpoint(reservationService: ReservationService): ReservationEndpoint {
        return ReservationEndpoint(reservationService)
    }
}
