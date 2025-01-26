package com.reserva.resto.restaurant_service.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "tbl_Restaurant")
@Data
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurant_id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "cuit_Id", nullable = false)
    private String cuitId;

    @Column(name = "social_reason", nullable = false)
    private String socialReason;

    @Column(name = "email")
    private String email;

    @Column(name = "adress", nullable = false)
    private String adress;

    @Column(name = "cellphone_number", nullable = false)
    private String cellphoneNumber;

    @Column(name = "food_category")
    private String foodCategory;

    @Column (name = "creation_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    @Column (name = "creation_user")
    private String creationUser;

    @Column (name = "modification_date")
    private Date modificationDate;

    @Column (name = "modification_user")
    private String modificationUser;

    @Column (name = "leaving_date")
    private Date leavingDate;

    @Column (name = "leaving_user")
    private String leavingUser;

}
