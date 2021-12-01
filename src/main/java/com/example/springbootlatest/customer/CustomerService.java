package com.example.springbootlatest.customer;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class CustomerService {
    public List<Customer> getCustomers(){
        return List.of(
                new Customer(
                        1L,
                        "Joe",
                        "Joe@gmail.com",
                        LocalDate.of(1997, Month.DECEMBER, 06),
                        24
                )
        );
    }
}
