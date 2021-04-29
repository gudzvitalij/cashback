package ru.opentraders.cashback.dto;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.json.JsonContent;

import static org.assertj.core.api.Assertions.assertThat;

@JsonTest

public class DeserializeTest {

    @Autowired
    private JacksonTester<CostDto> json;

    @Test
    void testDeserializeCostDto() throws Exception {
        CostDto dtoDeserialize = new CostDto(20000,8000,5000,3000,1000, 0, 0,0,0,0);
        JsonContent <CostDto> result = this.json.write(dtoDeserialize);


        assertThat(result).extractingJsonPathNumberValue("@.supermarketRub").isEqualTo(20000);
        assertThat(result).extractingJsonPathNumberValue("@.transportRub").isEqualTo(8000);
        assertThat(result).extractingJsonPathNumberValue("@.fuellingRub").isEqualTo(5000);
        assertThat(result).extractingJsonPathNumberValue("@.restaurantRub").isEqualTo(3000);
        assertThat(result).extractingJsonPathNumberValue("@.clothesShoesRub").isEqualTo(1000);
        assertThat(result).extractingJsonPathNumberValue("@.houseRepairRub").isEqualTo(0);
        assertThat(result).extractingJsonPathNumberValue("@.entertainmentRub").isEqualTo(0);
        assertThat(result).extractingJsonPathNumberValue("@.pharmacyRub").isEqualTo(0);
        assertThat(result).extractingJsonPathNumberValue("@.beautyRub").isEqualTo(0);
        assertThat(result).extractingJsonPathNumberValue("@.mobileRub").isEqualTo(0);

    }
}
