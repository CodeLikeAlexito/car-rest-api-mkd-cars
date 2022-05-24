package com.codelikealex.cars.car;

import com.codelikealex.cars.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CarRepository extends JpaRepository<Car, Long> {
    Optional<Car> findByAuthor(String author);
}
