package ru.opentraders.cashback.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.opentraders.cashback.dto.CategoryDto;
import ru.opentraders.cashback.repository.CategoryRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryConverter categoryConverter;

    public List<CategoryDto> findAll(){
        return categoryRepository.findAll()
                .stream()
                .map(categoryConverter::fromCategoryToCategoryDto)
                .collect(Collectors.toList());
    }

    public CategoryDto findById(Integer id){
        return categoryConverter.fromCategoryToCategoryDto(categoryRepository.findById(id).orElse(null));
    }




}
