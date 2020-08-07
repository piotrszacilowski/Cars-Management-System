package com.szacilowski.carsmanagementsystem.service;

import com.szacilowski.carsmanagementsystem.model.Car;
import com.szacilowski.carsmanagementsystem.repository.CarRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CarService implements CarServiceInterface {

    private List<Car> carList;

    CarService(CarRepo carRepo) {
        Car car1 = new Car("Renault", "Megane RS");
        Car car2 = new Car("BMW", "M2 Competition");
        Car car3 = new Car("Porsche", "911 Turbo S");

        carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
    }

    @Override
    public boolean addCar(Car car) {
        return carList.add(car);
    }

    @Override
    public List<Car> getCars() {
        return carList;
    }

    @Override
    public void deleteCar(Long id) {
        carList.stream().filter(car -> car.getId().equals(id)).findFirst().ifPresent(car -> carList.remove(car));
    }

    @Override
    public Optional<Car> getCarById(Long id) {
        return carList.stream().filter(car -> car.getId().equals(id)).findFirst();
    }


    @Override
    public void updateCar(Car car) {

    }
}
