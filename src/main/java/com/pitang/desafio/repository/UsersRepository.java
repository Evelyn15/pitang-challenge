package com.pitang.desafio.repository;

import com.pitang.desafio.dto.CarsDTO;
import com.pitang.desafio.dto.UserDTO;

public interface UsersRepository {

    UserDTO findAllByUserId (String logged_user_id);


}
