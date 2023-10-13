package com.SpringWeb.ProductSpringWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    @Autowired
    ProductDB productDB;
//    I want object this ProductDB so its Autowired The object will be created.
//    JUst for reference

    public void addProduct(Product product){
        productDB.save(product);
    }
   public  List<Product> getAllProducts(){
//       This method will work only when database connected
       return productDB.findAll();
    }

    public Product getProduct(String name){
       return  productDB.findByName(name);
    }

}