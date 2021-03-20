package ru.opentraders.cashback.dto;


import lombok.Data;

@Data
public class CategoryDto {

    private Integer categoryId;
    private Integer clauseId;
    private String nameCard;
    private Float supermarket;
    private Float transport;
    private Float fuelling;
    private Float restaurant;
    private Float clothesShoes;
    private Float houseRepair;
    private Float entertainment;
    private Float pharmacy;
    private Float beauty;
    private Float mobile;
}
