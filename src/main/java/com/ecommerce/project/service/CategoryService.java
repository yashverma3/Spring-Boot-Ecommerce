package com.ecommerce.project.service;

import com.ecommerce.project.payload.CategoryDTO;
import com.ecommerce.project.payload.CategoryResponse;

// Create CategoryService as interface to implement Loose Coupling
// Mention all the methods that are required and override them in CategoryServiceImpl class
public interface CategoryService {
    CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);
    CategoryDTO createCategory(CategoryDTO categoryDTO); // Returning the created category
    CategoryDTO deleteCategory(Long categoryId); // Returning the deleted category
    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId); // Returning the updated category
}
