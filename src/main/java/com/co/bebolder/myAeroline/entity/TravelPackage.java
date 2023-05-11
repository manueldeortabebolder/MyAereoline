package com.co.bebolder.myAeroline.entity;

import com.co.bebolder.myAeroline.enumerator.TravelPackageType;
import jakarta.persistence.*;

@Entity(name = "travel_packages")
public class TravelPackage {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type")
    private TravelPackageType type;

    @Column(name = "total_discount")
    private Float totalDiscount;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public TravelPackageType getType() {
        return type;
    }

    public void setType(TravelPackageType type) {
        this.type = type;
    }

    public Float getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(Float totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
