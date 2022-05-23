package com.codelikealex.cars.car;

import com.codelikealex.cars.entities.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

//    @Autowired
//    private UserRepository userRepository;

    public Car createNewCar(CarDto carDto){
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        String currentUserName = null;
//        if (!(authentication instanceof AnonymousAuthenticationToken)) {
//            currentUserName = authentication.getName();
//        }

//        User user = userRepository.findByUsername(currentUserName);
//        if(user == null) {
//            throw new CustomResponseStatusException(HttpStatus.BAD_REQUEST, "ERR503", "User is not authenticated!");
//        }

        Car car = Car.createPostWithFullDetails(carDto.getTitle(), carDto.getPrice(), carDto.getShortDescription(),
                carDto.getDescription(), carDto.getAdditionalInformation(), carDto.getCarLocation(), "TEST-STATIC-USER");
        return carRepository.save(car);
    }

}
