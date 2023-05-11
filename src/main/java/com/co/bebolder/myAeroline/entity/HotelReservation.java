package com.co.bebolder.myAeroline.entity;

import com.co.bebolder.myAeroline.enumerator.HotelReservationType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.util.Date;

@Entity(name = "hotel_reservations")
public class HotelReservation extends Reservation{

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private HotelReservationType type;

    @Column(name = "income_time")
    private Date incomeTime;

    @Column(name = "exit_time")
    private Date exitTime;

    @Column(name = "room")
    private String room;

    public HotelReservationType getType() {
        return type;
    }

    public void setType(HotelReservationType type) {
        this.type = type;
    }

    public Date getIncomeTime() {
        return incomeTime;
    }

    public void setIncomeTime(Date incomeTime) {
        this.incomeTime = incomeTime;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }


}
