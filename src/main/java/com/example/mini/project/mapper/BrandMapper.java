package com.example.mini.project.mapper;

import com.example.mini.project.dto.BrandDTO;
import com.example.mini.project.entity.Brand;
import org.springframework.http.ResponseEntity;

public class BrandMapper {
    public static Brand toBrand(BrandDTO dto){
        Brand brand=new Brand();
        brand.setName(dto.getName());
        return brand;
    }
    public static BrandDTO toDTO(Brand entity){
        BrandDTO dto=new BrandDTO();
        dto.setName(entity.getName());
        dto.setId(entity.getId());

        return dto;
    }
}
