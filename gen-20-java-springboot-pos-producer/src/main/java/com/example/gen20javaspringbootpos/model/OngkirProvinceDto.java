package com.example.gen20javaspringbootpos.model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OngkirProvinceDto {

    @SerializedName("province_id")
    private int provinceId;
    private String province;
}
