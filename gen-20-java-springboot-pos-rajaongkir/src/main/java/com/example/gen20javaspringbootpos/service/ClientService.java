package com.example.gen20javaspringbootpos.service;

import com.example.gen20javaspringbootpos.model.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Service
@RequiredArgsConstructor
public class ClientService {

    //MediaType mediaType = MediaType.parseMediaType("application/x-www-form-urlencoded");
    //String bodyString = "origin=501&destination=114&weight=1700&courier=jne";

    String apiKey = "edc3e958c7112c428d17ba2712bf5c8e";//"ddc51158003f859c6d74bfc4e5d0b75e";

    RestClient client = RestClient.create();

    //public ResponseEntity<String> listResponse(String url) {
    public List<OngkirCityDto> listResponseCity(String url) {
        ResponseEntity<String> result = client.get()
                .uri(url)
                .header("key", apiKey)
                .retrieve()
                .toEntity(String.class);

        JsonObject convertedObject = new Gson().fromJson(result.getBody(), JsonObject.class);
        JsonObject rajaongkirJson = convertedObject.getAsJsonObject("rajaongkir");
        JsonArray resultJson = rajaongkirJson.getAsJsonArray("results");

        Gson gson = new Gson();
        Type type = new TypeToken<List<OngkirCityDto>>() {}.getType();
        List<OngkirCityDto> resultList = gson.fromJson(resultJson,type);

        return resultList;
    }

    public List<OngkirProvinceDto> listResponseProvince(String url) {
        ResponseEntity<String> result = client.get()
                .uri(url)
                .header("key", apiKey)
                .retrieve()
                .toEntity(String.class);

        JsonObject convertedObject = new Gson().fromJson(result.getBody(), JsonObject.class);
        JsonObject rajaongkirJson = convertedObject.getAsJsonObject("rajaongkir");
        JsonArray resultJson = rajaongkirJson.getAsJsonArray("results");

        Gson gson = new Gson();
        Type type = new TypeToken<List<OngkirProvinceDto>>() {}.getType();
        List<OngkirProvinceDto> resultList = gson.fromJson(resultJson,type);

        return resultList;
    }

    public ResponseEntity<String> listResponse(String url, String id) {
        ResponseEntity<String> result = client.get()
                .uri(url+"?id="+id)
                .header("key", apiKey)
                .retrieve()
                .toEntity(String.class);

        return result;
    }



    //public ResponseEntity<String> costResponse(OngkirCostRequestDto cost) throws JsonProcessingException {
    //public List<JsonElement> costResponse(OngkirCostRequestDto cost) throws JsonProcessingException {
    public List<OngkirCostResultDto> costResponse(OngkirCostRequestDto cost) throws JsonProcessingException {
        String urlCost = "https://api.rajaongkir.com/starter/cost";

        ObjectMapper objMap = new ObjectMapper();
        String reqBody = objMap.writeValueAsString(cost);

        int length = reqBody.length();//cost.toString().length()-2;


        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(APPLICATION_JSON));
        headers.set("key",apiKey);
        headers.setContentType(APPLICATION_JSON);
        headers.setContentLength(length);
        //HttpEntity result = new HttpEntity<>(reqBody,headers);

        ResponseEntity<String> result =
                client.post()
                .uri(urlCost)
                .contentType(APPLICATION_JSON)
                .body(reqBody)
                .header("key", apiKey)
                .header("Content-Length", String.valueOf(length))
                .retrieve()
                .toEntity(String.class);


        JsonObject convertedObject = new Gson().fromJson(result.getBody(), JsonObject.class);
        JsonObject rajaongkirJson = convertedObject.getAsJsonObject("rajaongkir");
        JsonArray resultJson = rajaongkirJson.getAsJsonArray("results");
        Gson gson = new Gson();
        List<OngkirCostResultDto> resultList = new ArrayList<OngkirCostResultDto>();
        for (JsonElement e: resultJson) {

            resultList.add(gson.fromJson(e.getAsJsonObject(), OngkirCostResultDto.class));

        }

        //Type type = new TypeToken<Map<String,Object>>() {}.getType();

        //Map<String,Object> mappedJson = gson.fromJson(resultJson, type);

        //List<JsonElement> resultList = resultJson.asList();

        //Type type = new TypeToken<Map<String,Object>>() {}.getType();
        //Map<String,Object> rajaongkir = (Map<String,Object>) bodyTest.get("result");
        //Gson costGson = new Gson();
        //System.out.println(resultJson.toString());
        //OngkirCostResultDto[] costList=costGson.fromJson(resultJson,OngkirCostResultDto[].class);

        //List<OngkirCostResultDto> listed = Arrays.asList(costList);
        //System.out.println(listed);

        //ResponseEntity<String> test = new ResponseEntity<>(resultJson.toString(), HttpStatus.OK);
        return resultList;
    }


}
