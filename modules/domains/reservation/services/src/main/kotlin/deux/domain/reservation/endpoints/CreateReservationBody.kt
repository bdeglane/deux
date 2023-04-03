package deux.domain.reservation.endpoints

import deux.domain.reservation.ReservationInput
import deux.domain.reservation.ReservationInputInterface

class CreateReservationBody(
    override val dateStart: String,
    override val duration: Int,
    override val pax: Int,
) : ReservationInputInterface

fun createReservationBodyToReservationInput(body: CreateReservationBody): ReservationInput {
    return ReservationInput(
        dateStart = body.dateStart,
        duration = body.duration,
        pax = body.pax,
    )
}
