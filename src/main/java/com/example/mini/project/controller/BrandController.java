package com.example.mini.project.controller;

import com.example.mini.project.dto.BrandDTO;
import com.example.mini.project.entity.Brand;
import com.example.mini.project.mapper.BrandMapper;
import com.example.mini.project.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("brands")

public class BrandController {

    @Autowired
    private BrandService brandService;


    @PostMapping      // <?>  use it mean any respond can improve
    public ResponseEntity<?> saveData(@RequestBody BrandDTO dto)   {
        Brand brand = BrandMapper.toBrand(dto);

        Brand saveData = brandService.SaveData(brand);

        BrandDTO dto2 = BrandMapper.toDTO(saveData);
        return  ResponseEntity.ok(dto2);
    }
}
