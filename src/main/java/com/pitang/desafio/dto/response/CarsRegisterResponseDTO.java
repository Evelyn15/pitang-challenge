package com.pitang.desafio.dto.response;

import com.pitang.desafio.dto.CarsDTO;
import lombok.*;

import javax.persistence.Id;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarsRegisterResponseDTO {
    private @Id Integer id;
}
