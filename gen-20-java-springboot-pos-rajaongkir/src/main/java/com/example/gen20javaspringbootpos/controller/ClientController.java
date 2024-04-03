package com.example.gen20javaspringbootpos.controller;

import com.example.gen20javaspringbootpos.model.OngkirCityDto;
import com.example.gen20javaspringbootpos.model.OngkirCostRequestDto;
import com.example.gen20javaspringbootpos.model.OngkirCostResultDto;
import com.example.gen20javaspringbootpos.model.OngkirProvinceDto;
import com.example.gen20javaspringbootpos.service.ClientService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.JsonElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping(path="api/rajaongkir")
@RestController
public class ClientController {

    String urlProvince="https://api.rajaongkir.com/starter/province";
    String urlCity="https://api.rajaongkir.com/starter/city";

    @Autowired
    private ClientService clientService;

    @Scheduled(cron = "0 0 9-15 * * 1-5")
    @GetMapping("/province")
    //public ResponseEntity<String> getProvince(){
    public List<OngkirProvinceDto> getProvince(){
        return clientService.listResponseProvince(urlProvince);
    }

    @GetMapping("/province/{id}")
    public ResponseEntity<String> getProvince(@PathVariable("id") String id){
        return clientService.listResponse(urlProvince,id);
    }
    @Scheduled(cron = "0 0 9-15 * * 1-5")//testing
    @GetMapping("/city")
    //public ResponseEntity<String> getCity(){
    public List<OngkirCityDto> getCity(){
        System.out.println("|------------------------------------------------------------------|");
        System.out.println(clientService.listResponseCity(urlCity));
        return clientService.listResponseCity(urlCity);
    }

    @GetMapping("/city/{id}")
    public ResponseEntity<String> getCity(@PathVariable("id") String id){
        return clientService.listResponse(urlCity,id);
    }

    @PostMapping("/cost")
    @ResponseBody
    //public ResponseEntity<String> getCost(@RequestBody OngkirCostRequestDto cost) throws JsonProcessingException {
    public List<OngkirCostResultDto> getCost(@RequestBody OngkirCostRequestDto cost) throws JsonProcessingException {
        return clientService.costResponse(cost);
    }
}
