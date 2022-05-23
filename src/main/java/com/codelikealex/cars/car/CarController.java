package com.codelikealex.cars.car;

import com.codelikealex.cars.entities.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping("/")
    public ResponseEntity<Car> createPost(@RequestBody CarDto carDto) {
        Car car = carService.createNewCar(carDto);
        return  ResponseEntity.ok(car);
    }
}
