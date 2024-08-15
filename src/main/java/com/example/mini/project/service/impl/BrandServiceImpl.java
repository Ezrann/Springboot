package com.example.mini.project.service.impl;

import com.example.mini.project.entity.Brand;
import com.example.mini.project.repositiry.BrandsRepo;
import com.example.mini.project.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired  // Automatic Injection is a framework spring use for inject anything can join
    private BrandsRepo brandsRepo;

    @Override
    public Brand SaveData(Brand brand) {
        return brandsRepo.save(brand);


    }
}
