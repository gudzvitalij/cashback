package ru.opentraders.cashback.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "clause")
@NoArgsConstructor
public class Clause {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clauseId;

    @Column(name="name_card")
    private String nameCard;

    @Column(name="cost_service")
    private Integer costService;

    @Column(name="min_cost")
    private Integer minCost;

    @Column(name="max_cost")
    private Integer maxCost;

    @Column(name="min_balance")
    private Integer minBalance;

    @Column(name="persentage")
    private Float persentage;
}
