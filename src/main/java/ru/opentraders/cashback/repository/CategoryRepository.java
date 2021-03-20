package ru.opentraders.cashback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.opentraders.cashback.model.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
