package com.szacilowski.carsmanagementsystem.controller;

import com.szacilowski.carsmanagementsystem.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private List<Car> carList;

    public CarController() {
        Car car1 = new Car("Renault", "Megane RS",2015);
        Car car2 = new Car("BMW", "M2 Competition",2019);
        Car car3 = new Car("Porsche", "911 Turbo S",2016);

        carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
    }

    @GetMapping("/car")
    public String getCar(Model model) {
        model.addAttribute("cars", carList);
        model.addAttribute("newCar", new Car());
        return "car";
    }
}
