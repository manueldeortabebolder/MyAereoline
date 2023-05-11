package com.co.bebolder.myAeroline.entity;

import com.co.bebolder.myAeroline.enumerator.PayStatus;
import jakarta.persistence.*;

@Entity(name = "payments")
public class Payment {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "value")
    private Float value;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private PayStatus status;

    @Column(name = "code_pay")
    private String codePay;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public PayStatus getStatus() {
        return status;
    }

    public void setStatus(PayStatus status) {
        this.status = status;
    }

    public String getCodePay() {
        return codePay;
    }

    public void setCodePay(String codePay) {
        this.codePay = codePay;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
