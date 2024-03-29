package com.co.bebolder.myAeroline.repository;

import com.co.bebolder.myAeroline.entity.Payment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends CrudRepository<Payment, Long> {
}
