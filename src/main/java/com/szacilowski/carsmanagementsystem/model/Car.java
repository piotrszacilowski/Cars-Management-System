package com.szacilowski.carsmanagementsystem.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Car {
    private Long id;
    private String brand;
    private String model;
}
