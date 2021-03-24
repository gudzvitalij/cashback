package ru.opentraders.cashback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.opentraders.cashback.dto.CostDto;
import ru.opentraders.cashback.service.CashbackService;

@CrossOrigin
@RestController
@RequestMapping
public class CashbackController {

    private static final String CHOISE = "Ваш наилучший выбор: \n";
    private static final String ECONOMY = " Вы сэкономите за год примерно: ";
    private final CashbackService cashbackService;
    private CostDto costDto;

    @Autowired
    public CashbackController(CashbackService cashbackService) {
        this.cashbackService = cashbackService;
    }

    @PostMapping(value = "/cards", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public CostDto saveCost(@RequestBody CostDto costDto)  {
        this.costDto = costDto;
        return costDto;
    }

    @GetMapping(value = "/cards")
    public String getResult()  {
        cashbackService.findProfit(costDto);
        return (CHOISE + cashbackService.getBestCard() + ","
                + ECONOMY + cashbackService.getProfit() + " рублей");
    }



}
