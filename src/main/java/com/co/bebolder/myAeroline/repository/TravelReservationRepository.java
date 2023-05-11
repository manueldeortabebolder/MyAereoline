package com.co.bebolder.myAeroline.repository;

import com.co.bebolder.myAeroline.entity.TravelReservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelReservationRepository extends CrudRepository<TravelReservation, Long> {
}
