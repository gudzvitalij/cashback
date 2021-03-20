package ru.opentraders.cashback.service;

import org.springframework.stereotype.Service;
import ru.opentraders.cashback.dto.CategoryDto;
import ru.opentraders.cashback.model.Category;

@Service
public class CategoryConverter {

    public CategoryDto fromCategoryToCategoryDto(Category category) {
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setCategoryId(category.getCategoryId());
        categoryDto.setClauseId(category.getClauseId());
        categoryDto.setNameCard(category.getNameCard());
        categoryDto.setSupermarket(category.getSupermarket());
        categoryDto.setTransport(category.getTransport());
        categoryDto.setFuelling(category.getFuelling());
        categoryDto.setRestaurant(category.getRestaurant());
        categoryDto.setClothesShoes(category.getClothesShoes());
        categoryDto.setHouseRepair(category.getHouseRepair());
        categoryDto.setEntertainment(category.getEntertainment());
        categoryDto.setPharmacy(category.getPharmacy());
        categoryDto.setBeauty(category.getBeauty());
        categoryDto.setMobile(category.getMobile());
        return categoryDto;
    }

}
