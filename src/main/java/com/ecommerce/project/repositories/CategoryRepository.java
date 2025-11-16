package com.ecommerce.project.repositories;

import com.ecommerce.project.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository<{ Entity Name},{typeof Entity Unique ID}> -> Responsible for CRUD operations
public interface CategoryRepository extends JpaRepository<Category,Long> {

}
