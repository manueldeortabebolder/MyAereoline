package com.co.bebolder.myAeroline.repository;

import com.co.bebolder.myAeroline.entity.Discount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountRepository extends CrudRepository<Discount, Long> {
}
