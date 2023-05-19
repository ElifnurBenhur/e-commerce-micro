package com.kodlamaio.inventoryservice.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import com.kodlamaio.inventoryservice.entities.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int quantity;
    private double price;
    private String description;

    private boolean deleted;
    @Enumerated(EnumType.STRING)
    private Status status;
    @JsonManagedReference
    @ManyToMany(fetch = FetchType.LAZY)
    private Set<Catagory> catagories=new HashSet<>();






}
