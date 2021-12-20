package com.neosoftmail.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoftmail.model.Address;
import com.neosoftmail.serviceInterface.AddService;


@RestController
@RequestMapping("/add")
public class AddressController {
	
	@Autowired
	AddService addService;
	
	 @PostMapping("/address")
	    public  Address  createAddress(@RequestBody Address address) {
	       return addService.createAddDetails(address);
	    }

	 @GetMapping("/getAdd")
	    public List <Address> getAllAddress() {
	        return addService.getAllAddress();
	    }

}
