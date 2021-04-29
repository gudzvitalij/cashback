package ru.opentraders.cashback.dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CostDtoTest {
    @Test
    public void testToDto() {
        CostDto dto = new CostDto(10000,5000,3000,2000,1000, 0, 0,0,0,0);
        assertEquals(10000,dto.getSupermarketRub());
        assertEquals(5000,dto.getTransportRub());
        assertEquals(3000,dto.getFuellingRub());
        assertEquals(2000,dto.getRestaurantRub());
        assertEquals(1000,dto.getClothesShoesRub());
        assertEquals(0,dto.getHouseRepairRub());
        assertEquals(0,dto.getEntertainmentRub());
        assertEquals(0,dto.getPharmacyRub());
        assertEquals(0,dto.getBeautyRub());
        assertEquals(0,dto.getMobileRub());
    }

}
