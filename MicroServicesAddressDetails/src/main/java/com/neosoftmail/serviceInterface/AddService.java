package com.neosoftmail.serviceInterface;

import java.util.List;

import com.neosoftmail.model.Address;

public interface AddService {

	
	Address createAddDetails(Address address);
	List<Address> getAllAddress();
}
