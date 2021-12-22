package com.controller;

import java.util.List;

import com.dto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/test")
public class RestClientController {

    private static final String webUrl = "http://localhost:8081/customer/getAllCustomer";
    private static final String webUrlForPost = "http://localhost:8081/customer/saveCustomer";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public ResponseEntity<List<CustomerDto>> getAllCustomer(){
        ResponseEntity<List> result = restTemplate.getForEntity(webUrl, List.class);
        List<CustomerDto> responseBody = result.getBody();
        return ResponseEntity.ok(responseBody);
    }

    @PostMapping
    public ResponseEntity<CustomerDto> kaydet(@RequestBody CustomerDto kisiDto){
        ResponseEntity<CustomerDto> result = restTemplate.postForEntity(webUrlForPost, kisiDto, CustomerDto.class);
        CustomerDto responseBody = result.getBody();
        return ResponseEntity.ok(responseBody);
    }
}
