package com.crs.reservation.controllers.rest;


import com.crs.reservation.dto.ReservationDto;
import com.crs.reservation.dto.ReservationRequestDto;
import com.crs.reservation.dto.RoomDto;
import com.crs.reservation.service.RoomReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/reservation")
@CrossOrigin(origins = "http://localhost:4200")
public class RoomReservationController {

    @Autowired
    RoomReservationService roomReservationService;


    @GetMapping("rooms-available")
    public List<RoomDto> availableRooms(){

        return roomReservationService.getRoomsAvailable(null);
    }

    @GetMapping("/")
    public List<ReservationDto> reservations(){
        return roomReservationService.getReservations();
    }

    @PostMapping("rooms-available")
    public List<RoomDto> availableRoomsReq(@RequestBody ReservationRequestDto reservationRequestDto){
        return roomReservationService.getRoomsAvailable(reservationRequestDto);
    }

}
