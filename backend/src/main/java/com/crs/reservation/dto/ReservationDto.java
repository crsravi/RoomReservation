package com.crs.reservation.dto;

import java.util.Date;

public class ReservationDto {
    private Long id;
    private Date fromTimeStamp;
    private Date toTimeStamp;
    private Long roomId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }
}
