package com.SpringWeb.ProductSpringWeb;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
//Its trying to map.
public class Product {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    String name;
    String type;
    String place;
    int warranty;



    Product(){

    }
    Product(String name, String type, String place, int warranty){
        this.name = name;
        this.type = type;
        this.place = place;
        this.warranty = warranty;
    }

    
}
