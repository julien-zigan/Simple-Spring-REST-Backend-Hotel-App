package de.steinuntersteinen.hotel.controller;

import de.steinuntersteinen.hotel.model.Reservation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/reservations")
class ReservationController {

    @GetMapping
    public ResponseEntity<List<Reservation>> getReservations() {
        return  ResponseEntity.ok(
                Arrays.asList(
                        new Reservation[] {
                                new Reservation("1",
                                        null,
                                        null,
                                        "Returnin a Reservation Object works",
                                        "peter@mail.com",
                                        2
                                )}
                )
            );
    }
}
