package com.crs.reservation.service;

import com.crs.reservation.dao.ReservationRepository;
import com.crs.reservation.dao.RoomRepository;
import com.crs.reservation.dto.ReservationDto;
import com.crs.reservation.dto.ReservationRequestDto;
import com.crs.reservation.dto.RoomDto;
import com.crs.reservation.entity.Reservation;
import com.crs.reservation.entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class RoomReservationService {

    @Autowired
    RoomRepository roomRepository;

    @Autowired
    ReservationRepository  reservationRepository;

    public List<RoomDto> getRoomsAvailable(ReservationRequestDto reservationRequestDto){
        List<Room> roomList = roomRepository.findAll();
        List<Reservation> reservationList = reservationRepository.findAll();
        List<Long> blockedRooms=new ArrayList<>();

        reservationList.stream().forEach(rl->{
            if(!(((reservationRequestDto.getFromDate().before(rl.getFromTimeStamp()) && reservationRequestDto.getToDate().before(rl.getFromTimeStamp())) ||
                    ((reservationRequestDto.getFromDate().after(rl.getToTimeStamp()) && reservationRequestDto.getToDate().after(rl.getToTimeStamp()))
            )))){
                blockedRooms.add(rl.getRoom().getId());
            }
        });

        List<RoomDto> roomDtoList = new ArrayList<>();

        roomList.stream().forEach(roo->{
            if(!blockedRooms.contains(roo.getId())){
                RoomDto roomDto= new RoomDto();
                roomDto.setId(roo.getId());
                roomDto.setName(roo.getName());
                roomDto.setLocation(roo.getLocation());
                roomDto.setAmenities(roo.getAmenities());
                roomDto.setCapacity(roo.getCapacity());
                roomDto.setDescription(roo.getDescription());
                roomDtoList.add(roomDto);
            }
        });
        return roomDtoList;
    }

    public List<ReservationDto> getReservations(){

        List<Reservation> reservationList = reservationRepository.findAll();
        List<ReservationDto> reservationDtoList = new ArrayList<>();

        reservationList.stream().forEach(rl->{
            ReservationDto reservationDto  = new ReservationDto();
            reservationDto.setId(rl.getId());
            reservationDto.setFromTimeStamp(rl.getFromTimeStamp());
            reservationDto.setToTimeStamp(rl.getToTimeStamp());
            reservationDto.setRoomId(rl.getRoom().getId());
            reservationDtoList.add(reservationDto);
        });
        return reservationDtoList;
    }
}
