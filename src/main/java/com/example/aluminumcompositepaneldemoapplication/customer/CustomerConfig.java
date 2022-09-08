package com.example.aluminumcompositepaneldemoapplication.customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class CustomerConfig {

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository repository) {
        return args -> {
            Customer ahmed = new Customer(
                    1L,
                    "Ahmed",
                    "Steve",
                    "AhmedSteve@gmail.com",
                    "Libyan",
                    LocalDate.of(2002, Month.JANUARY, 25),
                    "0925752564",
                    "Tripoli, Algraba street"
            );
            Customer alex = new Customer(
                    "Alex",
                    "Ali",
                    "AlexAli@gmail.com",
                    "Libyan",
                    LocalDate.of(2001, Month.FEBRUARY, 9),
                    "0924837483",
                    "Tripoli, Aldol street"
            );

            repository.saveAll(
                    List.of(ahmed, alex)
            );
        };
    }
}
