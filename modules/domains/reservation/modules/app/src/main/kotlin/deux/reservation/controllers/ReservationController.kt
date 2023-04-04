package deux.reservation.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/greeting")
class ReservationController {

    @GetMapping("/{name}")
    fun greeting(@PathVariable name: String): String {
        return "Hello $name"
    }
}
