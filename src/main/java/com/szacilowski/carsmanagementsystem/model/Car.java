package com.szacilowski.carsmanagementsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
public class Car {
    @NonNull private String brand;
    @NonNull private String model;
    @NonNull private int year;
}
