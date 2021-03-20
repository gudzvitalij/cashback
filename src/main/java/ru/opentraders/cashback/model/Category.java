package ru.opentraders.cashback.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name="category")
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;

    @Column(name="clause_id")
    private Integer clauseId;

    @Column(name="name_card")
    private String nameCard;

    @Column(name="supermarket")
    private Float supermarket;

    @Column(name="transport")
    private Float transport;

    @Column(name="fuelling")
    private Float fuelling;

    @Column(name="restaurant")
    private Float restaurant;

    @Column(name="clothes_shoes")
    private Float clothesShoes;

    @Column(name="house_repair")
    private Float houseRepair;

    @Column(name="entertainment")
    private Float entertainment;

    @Column(name="pharmacy")
    private Float pharmacy;

    @Column(name="beauty")
    private Float beauty;

    @Column(name="mobile")
    private Float mobile;



}
