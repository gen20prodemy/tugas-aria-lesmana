package com.example.gen20javaspringbootpos.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OngkirCostResultDto {

    private String code;
    private String name;
    private List<OngkirCostDetailDto> costs;

}
