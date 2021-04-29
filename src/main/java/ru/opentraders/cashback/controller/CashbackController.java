package ru.opentraders.cashback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.opentraders.cashback.dto.CostDto;
import ru.opentraders.cashback.service.CashbackService;

@CrossOrigin
@RestController
public class CashbackController {

    private final CashbackService cashbackService;

    @Autowired
    public CashbackController(CashbackService cashbackService) {
        this.cashbackService = cashbackService;
    }

    @PostMapping(value = "/cards")
    public String saveCost(@RequestBody CostDto costDto) {
        cashbackService.setCostDto(costDto);
        return cashbackService.buildMessage();
    }

}
