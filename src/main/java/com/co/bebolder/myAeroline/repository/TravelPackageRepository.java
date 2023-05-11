package com.co.bebolder.myAeroline.repository;

import com.co.bebolder.myAeroline.entity.TravelPackage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelPackageRepository extends CrudRepository<TravelPackage, Long> {
}
