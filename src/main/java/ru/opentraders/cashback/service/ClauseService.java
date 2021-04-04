package ru.opentraders.cashback.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.opentraders.cashback.dto.ClauseDto;
import ru.opentraders.cashback.dto.CostDto;
import ru.opentraders.cashback.repository.ClauseRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ClauseService {

    private final ClauseRepository clauseRepository;
    private final ClauseConverter clauseConverter;
    private CostService costService;

    public List<ClauseDto> findAll() {
        return clauseRepository.findAll()
                .stream()
                .map(clauseConverter::fromClauseToClauseDto)
                .collect(Collectors.toList());
    }

    public ClauseDto findById(Integer id) {
        return clauseConverter.fromClauseToClauseDto(clauseRepository.findById(id).orElse(null));
    }



    public boolean checkCost(Integer id, CostDto costDto) {
        return (findById(id).getMinCost() <= costService.sum(costDto)
                && findById(id).getMaxCost()>=costService.sum(costDto));
    }


}
