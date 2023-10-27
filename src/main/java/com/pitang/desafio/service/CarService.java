package com.pitang.desafio.service;
import com.pitang.desafio.dto.response.CarsGetResponseDTO;

public interface CarService {

    CarsGetResponseDTO getAllCars (String logged_user_id);

}
