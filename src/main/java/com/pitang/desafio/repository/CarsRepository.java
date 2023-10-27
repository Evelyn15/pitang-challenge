package com.pitang.desafio.repository;

import com.pitang.desafio.dto.CarsDTO;

public interface CarsRepository {

    CarsDTO findAllByUserId (String logged_user_id);

}
