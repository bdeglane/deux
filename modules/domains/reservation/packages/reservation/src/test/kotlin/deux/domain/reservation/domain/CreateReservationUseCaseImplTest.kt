package deux.domain.reservation.domain

import deux.domain.reservation.adapter.repository.ReservationRepoInMemoryImpl
import deux.domain.reservation.model.ReservationInput
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import io.kotest.matchers.shouldNotBe

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
            dateStart = "donec",
            duration = 200,
            pax = 2)

        val reservation = createReservationUseCase.execute(newReservation)

        reservation.uuid shouldNotBe null
        reservation.dateStart shouldBe newReservation.dateStart
        reservation.duration shouldBe newReservation.duration
        reservation.pax shouldBe newReservation.pax
    }
}
