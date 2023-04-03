package reservation.app.modules

import endpoints.ReservationEndpointImpl
import infrastructures.ReservationInfrastructureImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import services.ReservationImpl

@Configuration
class ReservationModule {
    @Bean
    fun reservationInfrastructure(): ReservationInfrastructureImpl {
        return ReservationInfrastructureImpl()
    }

    @Bean
    fun reservationService(reservationInfrastructureImpl: ReservationInfrastructureImpl): ReservationImpl {
        return ReservationImpl(reservationInfrastructureImpl)
    }

    @Bean
    fun reservationEndpoint(reservationService: ReservationImpl): ReservationEndpointImpl {
        return ReservationEndpointImpl(reservationService)
    }
}
