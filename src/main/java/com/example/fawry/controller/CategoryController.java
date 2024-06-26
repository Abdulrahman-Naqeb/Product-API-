package com.example.fawry.controller;

import com.example.fawry.entity.Category;
import com.example.fawry.model.category.CategoryRequestDTO;
import com.example.fawry.model.category.CategoryResponseDTO;
import com.example.fawry.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "fawry/category")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping
    public List<CategoryResponseDTO> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @PostMapping
    public Category addNewCategory(@RequestBody CategoryRequestDTO categoryRequestDTO){
        return categoryService.addNewCategory(categoryRequestDTO);

    }

//    @DeleteMapping(path = "{CategoryId}")
//    public void deleteCategory(@PathVariable("CategoryId")Long CategoryId){
//        categoryService.deleteCategory(CategoryId);
//    }
//
//    @PutMapping(path = "{CategoryId}")
//    public void updateCategory(
//            @PathVariable("CategoryId") Long CategoryId,
//            @RequestParam(required = false) Double price,
//            @RequestParam(required = false) String image_url) {
//        categoryService.updateCategory(CategoryId, price, image_url);
//    }
}
