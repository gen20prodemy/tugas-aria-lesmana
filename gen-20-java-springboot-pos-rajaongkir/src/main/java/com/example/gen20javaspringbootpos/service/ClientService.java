package com.example.gen20javaspringbootpos.service;

import com.example.gen20javaspringbootpos.model.OngkirCostDto;
import com.example.gen20javaspringbootpos.model.OngkirProvinceDto;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Service
@RequiredArgsConstructor
public class ClientService {

    //MediaType mediaType = MediaType.parseMediaType("application/x-www-form-urlencoded");
    //String bodyString = "origin=501&destination=114&weight=1700&courier=jne";

    String apiKey = "ddc51158003f859c6d74bfc4e5d0b75e";

    RestClient client = RestClient.create();

    public ResponseEntity<String> listResponse(String url) {
        ResponseEntity<String> result = client.get()
                .uri(url)
                .header("key", apiKey)
                .retrieve()
                .toEntity(String.class);

        return result;
    }

    public ResponseEntity<String> listResponse(String url, String id) {
        ResponseEntity<String> result = client.get()
                .uri(url+"?id="+id)
                .header("key", apiKey)
                .retrieve()
                .toEntity(String.class);

        return result;
    }



    public ResponseEntity<String> costResponse(OngkirCostDto cost) {
        String urlCost = "https://api.rajaongkir.com/starter/cost";
        int length = cost.toString().length()-2;
        ResponseEntity<String> result = client.post()
                .uri(urlCost)
                .contentType(APPLICATION_JSON)
                .body(cost)
                .header("key", apiKey)
                .header("Content-Length", String.valueOf(length))
                //.header("content-type", "application/x-www-form-urlencoded")
                .retrieve()
                .toEntity(String.class);

        Gson test = new Gson();


        return result;
    }


}
