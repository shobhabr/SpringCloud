package com.shobha.microcloud.reservationservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservation")
public class ReservationWebServices {
    private final ReservationRepository reservationRepository;

    public ReservationWebServices(ReservationRepository reservationRepository) {
        super();
        this.reservationRepository = reservationRepository;
    }

    @GetMapping
    public Iterable<Reservation> getAllReservation(){
        return reservationRepository.findAll();
    }

    @GetMapping("/{reservationId}")
    public Reservation getReservationById(@PathVariable("reservationId") Long reservationId){
        return reservationRepository.findById(reservationId).get();
    }
}
