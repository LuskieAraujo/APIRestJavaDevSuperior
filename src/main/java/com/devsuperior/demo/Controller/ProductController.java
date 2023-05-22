package com.devsuperior.demo.Controller;

import com.devsuperior.demo.Entities.Department;
import com.devsuperior.demo.Entities.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    @GetMapping
    public Department listarDepartamentos(){
        Department d1 = new Department(1, "Tech");
        Department d2 = new Department(2, "Pet");

        Product p1 = new Product(1, "MacBook Pro", 4000.00, d1);
        Product p2 = new Product(2, "PC Gamer", 5000.00, d1);
        return d1;
    }
}