package com.fis.employee;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmployeeInitializer implements CommandLineRunner{
	private final EmployeeRepository itemRepository;

    EmployeeInitializer(EmployeeRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Stream.of("Lining", "PUMA", "Bad Boy", "Air Jordan", "Nike", "Adidas", "Reebok")
                .forEach(item -> itemRepository.save(new Employee(item)));

        itemRepository.findAll().forEach(System.out::println);
    }


}
