package com.codelikealex.cars.car;

import com.codelikealex.cars.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
