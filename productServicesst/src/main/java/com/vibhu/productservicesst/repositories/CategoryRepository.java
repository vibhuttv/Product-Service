package com.vibhu.productservicesst.repositories;

import com.vibhu.productservicesst.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    @Override
    Category save(Category category);
}
