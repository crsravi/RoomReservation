package com.crs.reservation.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Reservation {
    @Id
    private Long id;
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromTimeStamp;
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date toTimeStamp;
    @ManyToOne
    @JoinColumn(name="room_id")
    private Room room;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Date getFromTimeStamp() {
        return fromTimeStamp;
    }

    public void setFromTimeStamp(Date fromTimeStamp) {
        this.fromTimeStamp = fromTimeStamp;
    }

    public Date getToTimeStamp() {
        return toTimeStamp;
    }

    public void setToTimeStamp(Date toTimeStamp) {
        this.toTimeStamp = toTimeStamp;
    }
}
