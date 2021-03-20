package ru.opentraders.cashback.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.opentraders.cashback.dto.CostDto;

@Service
@AllArgsConstructor
public class CostService {

    public Integer sum(CostDto costDto) {
        return costDto.getSupermarketRub() + costDto.getTransportRub() + costDto.getFuellingRub() +
                costDto.getRestaurantRub() + costDto.getClothesShoesRub() + costDto.getHouseRepairRub() +
                costDto.getEntertainmentRub() + costDto.getPharmacyRub() + costDto.getPharmacyRub() +
                costDto.getMobileRub();
    }

}
