package com.learn.springboot.Learn.Springboot.database;

import com.learn.springboot.Learn.Springboot.models.Product;
import com.learn.springboot.Learn.Springboot.repositories.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//Now connect with mysql using JPA
@Configuration
public class Database {
    //logger
    private static final Logger logger = LoggerFactory.getLogger(Database.class);
    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Product productA = new Product("Macbook Pro 16", 2023, 2408.4, "");
                Product productB = new Product("Ipad Air Green", 2021, 1508.5, "");
                logger.info("Insert data: " + productRepository.save(productA));
                logger.info("Insert data: " + productRepository.save(productB));
            }
        };
    }
}
