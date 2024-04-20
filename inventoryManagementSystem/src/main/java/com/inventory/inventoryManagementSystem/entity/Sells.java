package com.inventory.inventoryManagementSystem.entity;

import com.inventory.inventoryManagementSystem.common.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "sells")
public class Sells extends BaseEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long prodId;
    private int quantity;
    private double perPrice;
    private double totalPrice;

}
