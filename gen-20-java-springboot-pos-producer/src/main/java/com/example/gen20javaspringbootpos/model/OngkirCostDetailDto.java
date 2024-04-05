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
public class OngkirCostDetailDto {

    private String service;
    private String description;
    private List<OngkirCostValueDto> cost;


}
