package com.example.mini.project.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table

public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brand_id")
    private Long id;

    @Column(name = "brand_name")
    private String name;
}
