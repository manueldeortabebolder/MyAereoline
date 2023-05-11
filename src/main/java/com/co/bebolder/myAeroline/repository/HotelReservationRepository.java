package com.co.bebolder.myAeroline.repository;

import com.co.bebolder.myAeroline.entity.HotelReservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelReservationRepository extends CrudRepository<HotelReservation, Long> {
}
