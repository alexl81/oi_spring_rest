package ru.oneicon.oi_spring_rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.oneicon.oi_spring_rest.exceptions.UserNotFoundException;
import ru.oneicon.oi_spring_rest.model.Category;
import ru.oneicon.oi_spring_rest.repository.CategoryRepository;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category addCategory(Category category) {
        return categoryRepository.saveAndFlush(category);
    }

    public List<Category> findAllCategories() {
        return categoryRepository.findAll();
    }

    public Category updateCategory(Category category) {
        return categoryRepository.saveAndFlush(category);
    }

    public Category findCategoryById(Long id) {
        return categoryRepository.findEmployeeById(id).
                orElseThrow(() -> new UserNotFoundException("Category by this"+ id + "was not found"));
    }

    public void deleteCategory (Long id) {
        categoryRepository.deleteEmployeeById(id);
    }

}
