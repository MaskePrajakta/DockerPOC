package com.neosoftmail.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoftmail.model.Address;
import com.neosoftmail.repository.AddressRepo;
import com.neosoftmail.serviceInterface.AddService;




@Service
public class AddressServiceImpl implements AddService{

	@Autowired
	AddressRepo addRepo;
	
	

	@Override
	public Address createAddDetails(Address address) {
		// TODO Auto-generated method stub
		return addRepo.save(address);
	}



	@Override
	public List<Address> getAllAddress() {
		// TODO Auto-generated method stub
		return addRepo.findAll();
	}

}
