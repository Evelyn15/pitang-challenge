package com.pitang.desafio.dto.response;

import com.pitang.desafio.dto.CarsDTO;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarsGetResponseDTO {
    private List<CarsDTO> allCars;

}
