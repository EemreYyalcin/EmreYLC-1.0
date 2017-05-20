package com.emreylc.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emreylc.data.entities.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {

}
