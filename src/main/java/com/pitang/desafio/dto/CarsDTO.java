package com.pitang.desafio.dto;

import lombok.*;

import javax.persistence.Id;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarsDTO {
    private @Id String id;
    private  Integer year;
    private String licensePlate;
    private String model;
    private String color;


    public static Object mapperCars(UserDTO userDTO) {
        return  CarsDTO.builder()
                .id(cars.getId())
                .year(cars.getYear())
                .licensePlate(cars.getLicensePlate())
                .model(cars.getModel())
                .color(cars.getColor())
                .build();
    }
}
