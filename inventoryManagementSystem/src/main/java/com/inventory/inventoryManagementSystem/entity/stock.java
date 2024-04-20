package com.inventory.inventoryManagementSystem.entity;

import com.inventory.inventoryManagementSystem.common.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "stock")
public class stock extends BaseEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long prodId;
    private Long purchId;
    private Long sellId;
    private int totalQuantity;

}
