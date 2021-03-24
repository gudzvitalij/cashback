package ru.opentraders.cashback.dto;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;


@ToString
@EqualsAndHashCode
public class CostDto {
    @NotNull
    private Integer supermarketRub;
    @NotNull
    private Integer transportRub;
    @NotNull
    private Integer fuellingRub;
    @NotNull
    private Integer restaurantRub;
    @NotNull
    private Integer clothesShoesRub;
    @NotNull
    private Integer houseRepairRub;
    @NotNull
    private Integer entertainmentRub;
    @NotNull
    private Integer pharmacyRub;
    @NotNull
    private Integer beautyRub;
    @NotNull
    private Integer mobileRub;
    @NotNull
    public CostDto() {
    }

    public CostDto (Integer supermarketRub, Integer transportRub, Integer fuellingRub, Integer restaurantRub,
                    Integer clothesShoesRub, Integer houseRepairRub, Integer entertainmentRub, Integer pharmacyRub,
                    Integer beautyRub, Integer mobileRub) {
        this.supermarketRub = supermarketRub;
        this.transportRub = transportRub;
        this.fuellingRub = fuellingRub;
        this.restaurantRub = restaurantRub;
        this.clothesShoesRub = clothesShoesRub;
        this.houseRepairRub = houseRepairRub;
        this.entertainmentRub = entertainmentRub;
        this.pharmacyRub = pharmacyRub;
        this.beautyRub = beautyRub;
        this.mobileRub = mobileRub;
    }

    public Integer getSupermarketRub() {
        return supermarketRub;
    }

    public void setSupermarketRub(Integer supermarketRub) {
        this.supermarketRub = supermarketRub;
    }

    public Integer getTransportRub() {
        return transportRub;
    }

    public void setTransportRub(Integer transportRub) {
        this.transportRub = transportRub;
    }

    public Integer getFuellingRub() {
        return fuellingRub;
    }

    public void setFuellingRub(Integer fuellingRub) {
        this.fuellingRub = fuellingRub;
    }

    public Integer getRestaurantRub() {
        return restaurantRub;
    }

    public void setRestaurantRub(Integer restaurantRub) {
        this.restaurantRub = restaurantRub;
    }

    public Integer getClothesShoesRub() {
        return clothesShoesRub;
    }

    public void setClothesShoesRub(Integer clothesShoesRub) {
        this.clothesShoesRub = clothesShoesRub;
    }

    public Integer getHouseRepairRub() {
        return houseRepairRub;
    }

    public void setHouseRepairRub(Integer houseRepairRub) {
        this.houseRepairRub = houseRepairRub;
    }

    public Integer getEntertainmentRub() {
        return entertainmentRub;
    }

    public void setEntertainmentRub(Integer entertainmentRub) {
        this.entertainmentRub = entertainmentRub;
    }

    public Integer getPharmacyRub() {
        return pharmacyRub;
    }

    public void setPharmacyRub(Integer pharmacyRub) {
        this.pharmacyRub = pharmacyRub;
    }

    public Integer getBeautyRub() {
        return beautyRub;
    }

    public void setBeautyRub(Integer beautyRub) {
        this.beautyRub = beautyRub;
    }

    public Integer getMobileRub() {
        return mobileRub;
    }

    public void setMobileRub(Integer mobileRub) {
        this.mobileRub = mobileRub;
    }
}
