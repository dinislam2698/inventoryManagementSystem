package com.inventory.inventoryManagementSystem.entity;

import com.inventory.inventoryManagementSystem.common.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "product")
@Data
public class Product extends BaseEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String desc;

}
