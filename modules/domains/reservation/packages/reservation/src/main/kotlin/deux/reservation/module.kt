package deux.reservation

import deux.reservation.adapter.primary.ReservationEndpointImpl
import deux.reservation.adapter.secondary.ReservationRepoInMemoryImpl
import deux.reservation.adapter.usecase.CreateReservationUseCaseImpl
import deux.reservation.adapter.usecase.GetReservationUseCaseImpl
import deux.reservation.domain.primary.ReservationEndpoint
import deux.reservation.domain.secondary.ReservationRepo
import deux.reservation.domain.usecase.CreateReservationUseCase
import deux.reservation.domain.usecase.GetReservationUseCase
import org.koin.dsl.module

val reservationModule = module {
    single<ReservationRepo> { ReservationRepoInMemoryImpl() }
    single<GetReservationUseCase> { GetReservationUseCaseImpl(get()) }
    single<CreateReservationUseCase> { CreateReservationUseCaseImpl(get()) }
    single<ReservationEndpoint> { ReservationEndpointImpl(get(), get()) }
}
