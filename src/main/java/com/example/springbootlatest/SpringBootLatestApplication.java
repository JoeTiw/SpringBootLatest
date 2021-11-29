package com.example.springbootlatest;

import com.example.springbootlatest.customer.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringBootLatestApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringBootLatestApplication.class, args);

    }
    @GetMapping
    public List<Customer> hello(){
        return List.of(
                new Customer(1L,
                        "Joe",
                        "joe@gmail.com",
                        LocalDate.of(1997, 03, 25),
                        21)
        );
    }

}
