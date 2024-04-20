package com.inventory.inventoryManagementSystem.entity;

import com.inventory.inventoryManagementSystem.common.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "purchase")
public class Purchase extends BaseEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id",nullable = false,updatable = false)
    private Long id;

    private Long prodId;

    private int quantity;

    private double perPrice;

    private double totalPrice;

}
