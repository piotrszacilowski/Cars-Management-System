package com.szacilowski.carsmanagementsystem.service;

import com.szacilowski.carsmanagementsystem.model.Car;

import java.util.List;
import java.util.Optional;

public interface CarServiceInterface {
    boolean addCar(Car car);
    List<Car> getCars();
    void deleteCar(Long id);
    void updateCar(Car car);
    Optional<Car> getCarById(Long id);
}
