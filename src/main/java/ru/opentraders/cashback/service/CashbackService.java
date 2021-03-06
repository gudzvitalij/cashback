package ru.opentraders.cashback.service;


import org.springframework.stereotype.Service;
import ru.opentraders.cashback.dto.CostDto;

@Service
public class CashbackService {
    private final CategoryService categoryService;
    private final ClauseService clauseService;
    private int profit;
    private String bestCard;
    private CostDto costDto;

    public void setCostDto(CostDto costDto) {
        this.costDto = costDto;
    }

    public CashbackService(CategoryService categoryService, ClauseService clauseService) {
        this.categoryService = categoryService;
        this.clauseService = clauseService;
    }

    public void findProfit() {
        Integer index = 0;
        Float maxAmount = 0f;
        Float amount = 0f;


        for (Integer i = 1; i <= categoryService.findAll().size(); i++) {

            if (clauseService.checkCost(categoryService.findById(i).getClauseId(),costDto)) {

                amount = costDto.getSupermarketRub() * categoryService.findById(i).getSupermarket() +
                        costDto.getTransportRub() * categoryService.findById(i).getTransport() +
                        costDto.getFuellingRub() * categoryService.findById(i).getFuelling() +
                        costDto.getRestaurantRub() * categoryService.findById(i).getRestaurant() +
                        costDto.getClothesShoesRub() * categoryService.findById(i).getClothesShoes() +
                        costDto.getHouseRepairRub() * categoryService.findById(i).getHouseRepair() +
                        costDto.getEntertainmentRub() * categoryService.findById(i).getEntertainment() +
                        costDto.getPharmacyRub() * categoryService.findById(i).getPharmacy() +
                        costDto.getBeautyRub() * categoryService.findById(i).getBeauty() +
                        costDto.getMobileRub() * categoryService.findById(i).getMobile();

                if (amount > maxAmount) {
                    maxAmount = amount;
                    index = i;
                }
            }
        }
        this.profit = 12*Math.round(maxAmount);
        this.bestCard = categoryService.findById(index).getNameCard();
    }


    public String buildMessage() {
        findProfit();
        String choice = MessagePattern.CHOICE.getValue();
        String economy = MessagePattern.ECONOMY.getValue();
        return String.format(choice+economy,this.bestCard,this.profit);

    }



}
