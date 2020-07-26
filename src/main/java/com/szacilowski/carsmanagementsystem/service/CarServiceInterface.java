package com.szacilowski.carsmanagementsystem.service;

import com.szacilowski.carsmanagementsystem.model.Car;

import java.util.List;

public interface CarServiceInterface {
    boolean addCar(Car car);
    List<Car> getCar();
}
