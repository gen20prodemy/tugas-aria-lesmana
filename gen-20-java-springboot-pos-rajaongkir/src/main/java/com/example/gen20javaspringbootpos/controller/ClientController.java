package com.example.gen20javaspringbootpos.controller;

import com.example.gen20javaspringbootpos.model.OngkirCostDto;
import com.example.gen20javaspringbootpos.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;


@RequestMapping(path="api/rajaongkir")
@RestController
public class ClientController {

    String urlProvince="https://api.rajaongkir.com/starter/province";
    String urlCity="https://api.rajaongkir.com/starter/city";

    @Autowired
    private ClientService clientService;

    @Scheduled(cron = "0 0 9-15 * * 1-5")
    @GetMapping("/province")
    public ResponseEntity<String> getProvince(){
        return clientService.listResponse(urlProvince);
    }

    @GetMapping("/province/{id}")
    public ResponseEntity<String> getProvince(@PathVariable("id") String id){
        return clientService.listResponse(urlProvince,id);
    }
    @Scheduled(cron = "*/10 * * * * 1-5")//testing
    @GetMapping("/city")
    public ResponseEntity<String> getCity(){
        System.out.println(clientService.listResponse(urlCity));
        return clientService.listResponse(urlCity);
    }

    @GetMapping("/city/{id}")
    public ResponseEntity<String> getCity(@PathVariable("id") String id){
        return clientService.listResponse(urlCity,id);
    }

    @PostMapping("/cost")
    @ResponseBody
    public ResponseEntity<String> getCost(@RequestBody OngkirCostDto cost){
        return clientService.costResponse(cost);
    }
}
