package ru.oneicon.oi_spring_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.oneicon.oi_spring_rest.model.Category;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Optional<Category> findCategoryById(Long id);

    void deleteCategoryById(Long id);
}
