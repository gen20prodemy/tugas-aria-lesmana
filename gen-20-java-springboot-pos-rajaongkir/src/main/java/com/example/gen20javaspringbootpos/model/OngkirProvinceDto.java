package com.example.gen20javaspringbootpos.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OngkirProvinceDto {
    private int provinceId;
    private String province;
}
