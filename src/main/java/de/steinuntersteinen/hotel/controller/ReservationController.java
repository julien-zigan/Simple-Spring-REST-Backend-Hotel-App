package de.steinuntersteinen.hotel.controller;

import de.steinuntersteinen.hotel.model.Reservation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservations")
class ReservationController {

    @GetMapping
    public ResponseEntity<Reservation> getReservation() {
        return  ResponseEntity.ok( new Reservation("1", null, null, "Returnin a Reservation Object works", "peter@mail.com", 2));
    }
}
