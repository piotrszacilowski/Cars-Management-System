package com.szacilowski.carsmanagementsystem.controller;

import com.szacilowski.carsmanagementsystem.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    public CarController() {

    }

    @GetMapping("/car")
    public String getCar(Model model) {
        model.addAttribute("cars", carList);
        model.addAttribute("newCar", new Car());
        return "car";
    }

    @PostMapping("/add-car")
    public String addCar(@ModelAttribute Car car) {
        carList.add(car);
        return "redirect:/car";
    }
}
