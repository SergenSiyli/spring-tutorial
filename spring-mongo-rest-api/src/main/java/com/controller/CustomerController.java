package com.controller;

import com.dto.CustomerDto;
import com.service.CustomerService;
import com.service.ICustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {
      private final ICustomerService customerService;

      @GetMapping("/getAllCustomer")
      public ResponseEntity<List<CustomerDto>> getAllCustomer() {
            return ResponseEntity.ok(customerService.getAll());
      }

      @PostMapping("/saveCustomer")
      public ResponseEntity<CustomerDto> saveCustomer(@Valid @RequestBody CustomerDto customerDto) {
            return ResponseEntity.ok(customerService.save(customerDto));
      }
}
