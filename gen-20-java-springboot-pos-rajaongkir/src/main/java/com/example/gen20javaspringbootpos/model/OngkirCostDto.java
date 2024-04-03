package com.example.gen20javaspringbootpos.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OngkirCostDto  {

    private String origin;
    private String destination;
    private int weight;
    private String courier;

}
