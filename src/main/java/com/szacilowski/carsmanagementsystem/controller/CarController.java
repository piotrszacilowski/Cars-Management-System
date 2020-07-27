package com.szacilowski.carsmanagementsystem.controller;

import com.szacilowski.carsmanagementsystem.model.Car;
import com.szacilowski.carsmanagementsystem.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CarController {

    CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getCars(Model model) {
        List<Car> carsList = carService.getCars();
        model.addAttribute("cars", carsList);
        model.addAttribute("newCar", new Car());
        return "car";
    }

//    @PostMapping("/add-car")
//    public String addCar(@ModelAttribute Car car) {
//        carsList.add(car);
//        return "redirect:/car";
//    }
}
