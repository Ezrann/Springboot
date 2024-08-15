package com.example.mini.project.repositiry;

import com.example.mini.project.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BrandsRepo extends JpaRepository<Brand, Long >   {
}
