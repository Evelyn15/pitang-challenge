package com.pitang.desafio.controller;

import com.pitang.desafio.dto.response.CarsGetResponseDTO;
import com.pitang.desafio.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/api/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public ResponseEntity<CarsGetResponseDTO> getCars(
            @RequestParam String logged_user_id) {
        return ResponseEntity.ok().body(carService.getAllCars(logged_user_id));
    }
}
