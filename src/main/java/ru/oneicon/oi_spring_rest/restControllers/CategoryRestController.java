package ru.oneicon.oi_spring_rest.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.oneicon.oi_spring_rest.model.Category;
import ru.oneicon.oi_spring_rest.service.CategoryService;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryRestController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryRestController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping("/all")
    public ResponseEntity<List<Category>> getAllCategories() {
        List<Category> categories = categoryService.findAllCategories();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable("id") Long id) {
        Category category = categoryService.findCategoryById(id);
        return new ResponseEntity<>(category, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Category> addCategory(@RequestBody Category category) {
        Category newCategory = categoryService.addCategory(category);
        return new ResponseEntity<>(newCategory, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Category> updateCategory(@RequestBody Category category) {
        Category updateCategory = categoryService.updateCategory(category);
        return new ResponseEntity<>(updateCategory, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCategory(@PathVariable("id") Long id) {
        categoryService.deleteCategory(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
