package com.gozde.dockercomposedemo.controller;

import com.gozde.dockercomposedemo.model.Customer;
import com.gozde.dockercomposedemo.model.dto.CreateCustomerDto;
import com.gozde.dockercomposedemo.service.CustomerService;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping()
public class CustomerController {

    private final CustomerService customerService;
    private final Environment env;


    public CustomerController(CustomerService customerService, Environment env) {
        this.customerService = customerService;
        this.env = env;
    }

    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> getAllCustomer() {
        List<Customer> allCustomers = customerService.getAllCustomers();
        return ResponseEntity.ok(allCustomers);
    }

    @PostMapping("/create")
    public ResponseEntity<CreateCustomerDto> createCustomer(@RequestBody CreateCustomerDto dto) {
        customerService.createCustomer(dto);
        return ResponseEntity.ok(dto);
    }

    @GetMapping("/check-variable")
    public ResponseEntity<?> checkVariable(){
        Map<String, Object> result = new HashMap<>();
        String urlConnection = env.getProperty("ENV_URL_CONNECTION");
        String userName = env.getProperty("ENV_USER_NAME");
        String password = env.getProperty("ENV_PASSWORD");
        result.put("URL_CONNECTION", urlConnection);
        result.put("USER_NAME", userName);
        result.put("PASSWORD", password);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("/health")
    public void healthCheck(){
        System.out.println("application is ready to start");
    }
}
