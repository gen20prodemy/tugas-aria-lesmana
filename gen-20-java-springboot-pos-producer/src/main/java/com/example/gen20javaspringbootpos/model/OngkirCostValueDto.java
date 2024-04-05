package com.example.gen20javaspringbootpos.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OngkirCostValueDto {

    private int value;
    private String etd;
    private String note;


}
