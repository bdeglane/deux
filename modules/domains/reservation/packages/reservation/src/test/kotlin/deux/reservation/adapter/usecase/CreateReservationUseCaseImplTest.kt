package deux.reservation.adapter.usecase

import deux.reservation.adapter.secondary.ReservationRepoInMemoryImpl
import deux.reservation.domain.secondary.ReservationRepo
import deux.reservation.domain.usecase.CreateReservationUseCase
import deux.reservation.model.ReservationInput
import org.junit.jupiter.api.BeforeEach
import java.time.OffsetDateTime
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class CreateReservationUseCaseImplTest {

    private lateinit var createReservationUseCase: CreateReservationUseCase
    private lateinit var reservationRepo: ReservationRepo

    @BeforeEach
    fun beforeEach() {
        reservationRepo = ReservationRepoInMemoryImpl()
        createReservationUseCase = CreateReservationUseCaseImpl(
            reservationRepo = reservationRepo
        )
    }

    @Test
    fun `GIVEN a new reservation WHEN it is created THEN a new reservation is persisted`() {
        val newReservation = ReservationInput(
            dateStart = OffsetDateTime.now(),
            duration = 200,
            pax = 2
        )

        val reservation = createReservationUseCase.execute(newReservation)

        assertNotNull(reservation.uuid)
        assertEquals(newReservation.dateStart, reservation.dateStart)
        assertEquals(newReservation.duration, reservation.duration)
        assertEquals(newReservation.pax, reservation.pax)
    }
}
