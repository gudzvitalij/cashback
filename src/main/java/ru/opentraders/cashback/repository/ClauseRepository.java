package ru.opentraders.cashback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.opentraders.cashback.model.Clause;

public interface ClauseRepository extends JpaRepository<Clause,Integer> {

}
