package com.szacilowski.carsmanagementsystem.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Car {
    private String brand;
    private String model;
    private int year;
}
