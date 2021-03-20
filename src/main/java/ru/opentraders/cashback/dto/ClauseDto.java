package ru.opentraders.cashback.dto;

import lombok.Data;

@Data
public class ClauseDto {

    private Integer clauseId;
    private String nameCard;
    private Integer costService;
    private Integer minCost;
    private Integer maxCost;
    private Integer minBalance;
    private Float persentage;

}
