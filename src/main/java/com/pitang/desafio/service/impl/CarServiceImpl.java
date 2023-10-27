package com.pitang.desafio.service.impl;

import com.pitang.desafio.dto.CarsDTO;
import com.pitang.desafio.dto.UserDTO;
import com.pitang.desafio.repository.CarsRepository;
import com.pitang.desafio.repository.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CarServiceImpl {

    @Autowired
    private CarsRepository carsRepository;

    @Autowired
    private UsersRepository usersRepository;

    private  static List<UserDTO> loggedUser = new ArrayList<>();

    public List<CarsDTO> getAllCars(String logged_user_id) {

        loggedUser = Collections.singletonList(usersRepository.findAllByUserId(logged_user_id));

        List<CarsDTO> cars = loggedUser.stream().map(CarsDTO::mapperCars).collect(Collectors.toList());
        return cars;
    }


}
