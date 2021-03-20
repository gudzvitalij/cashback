package ru.opentraders.cashback.service;

import org.springframework.stereotype.Service;
import ru.opentraders.cashback.dto.ClauseDto;
import ru.opentraders.cashback.model.Clause;

@Service
public class ClauseConverter {

    public ClauseDto fromClauseToClauseDto(Clause clause) {
        ClauseDto clauseDto = new ClauseDto();
        clauseDto.setClauseId(clause.getClauseId());
        clauseDto.setNameCard(clause.getNameCard());
        clauseDto.setCostService(clause.getCostService());
        clauseDto.setMinCost(clause.getMinCost());
        clauseDto.setMaxCost(clause.getMaxCost());
        clauseDto.setMinBalance(clause.getMinBalance());
        clauseDto.setPersentage(clause.getPersentage());
        return clauseDto;
    }


}
