package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;

import java.util.List;

// Create CategoryService as interface to implement Loose Coupling
// Mention all the methods that are required and override them in CategoryServiceImpl class
public interface CategoryService {
    List<Category> getAllCategories();
    void createCategory(Category category);
    String deleteCategory(Long categoryId);
    Category updateCategory(Category category, Long categoryId);
}
