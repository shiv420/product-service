package com.spring.microservice.contoller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/product-service")
public class ProductController {
    public record Product(String name,String id, String category){}

    public static List<Product> pList = List.of(
            new Product("i10","CAR0001","Automobile"),
            new Product("SamsungTV","TV0001","Electronic"),
            new Product("i20","CAR0020","Automobile"),
            new Product("k8","EB00001","EBooks")

    );
    @GetMapping("/welcome-message")
    public String WelcomeMessage(){
        return "Welcome to Product Service";
    }


}
