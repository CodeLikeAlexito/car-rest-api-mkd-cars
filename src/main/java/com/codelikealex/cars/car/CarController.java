package com.codelikealex.cars.car;

import com.codelikealex.cars.entities.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/car")
@Slf4j
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping("/")
    public ResponseEntity<Car> createCarPost(@RequestBody CarDto carDto) {
        log.info("Creating new Car Post inside car service create car post.");
        Car car = carService.createNewCar(carDto);
        return  ResponseEntity.ok(car);
    }

    @GetMapping("/id/{clientId}")
    public Car getCarPostById(@PathVariable Long clientId) {
        return carService.getCarPostById(clientId);
    }

    @GetMapping("/author/{author}")
    public Car getCarPostById(@PathVariable String author) {
        return carService.getCarPostByAuthor(author);
    }
}
