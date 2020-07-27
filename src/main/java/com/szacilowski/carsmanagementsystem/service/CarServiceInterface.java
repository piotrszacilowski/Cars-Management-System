package com.szacilowski.carsmanagementsystem.service;

import com.szacilowski.carsmanagementsystem.model.Car;

import java.util.List;

public interface CarServiceInterface {
    boolean addCar(Car car);
    List<Car> getCars();
    void deleteCar(Long id);
    void updateCar(Car car);
}
