package com.crs.reservation.dao;

import com.crs.reservation.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoomRepository extends JpaRepository<Room,Long> {
}
