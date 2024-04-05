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
    public class OngkirCityDto  {

        @SerializedName("city_id")
        private int cityId;
        @SerializedName("province_id")
        private int provinceId;
        private String province;
        private String type;
        @SerializedName("city_name")
        private String cityName;
        @SerializedName("postal_code")
        private int postalCode;


}
