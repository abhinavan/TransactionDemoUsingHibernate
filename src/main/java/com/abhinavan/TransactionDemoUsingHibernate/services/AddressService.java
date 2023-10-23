package com.abhinavan.TransactionDemoUsingHibernate.services;

import com.abhinavan.TransactionDemoUsingHibernate.dao.IAddressRepository;
import com.abhinavan.TransactionDemoUsingHibernate.models.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService
{

    @Autowired
    private IAddressRepository addressRepository;

    public Address saveAddress(Address address)
    {
        return addressRepository.saveAndFlush(address);
    }
}
