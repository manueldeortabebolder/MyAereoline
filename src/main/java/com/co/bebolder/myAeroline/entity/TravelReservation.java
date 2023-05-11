package com.co.bebolder.myAeroline.entity;

import com.co.bebolder.myAeroline.enumerator.TravelReservationType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.util.Date;

@Entity(name = "travel_reservations")
public class TravelReservation extends Reservation {

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private TravelReservationType type;

    @Column(name = "travel_time")
    private Date travelTime;

    @Column(name = "plane_name")
    private String planeName;

    @Column(name = "chair")
    private String chair;

    @Column(name = "door")
    private String door;

    public TravelReservationType getType() {
        return type;
    }

    public void setType(TravelReservationType type) {
        this.type = type;
    }

    public Date getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(Date travelTime) {
        this.travelTime = travelTime;
    }

    public String getPlaneName() {
        return planeName;
    }

    public void setPlaneName(String planeName) {
        this.planeName = planeName;
    }

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }


}

