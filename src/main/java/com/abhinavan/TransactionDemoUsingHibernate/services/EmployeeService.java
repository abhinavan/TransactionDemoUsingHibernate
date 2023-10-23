package com.abhinavan.TransactionDemoUsingHibernate.services;

import com.abhinavan.TransactionDemoUsingHibernate.dao.IEmployeeRepository;
import com.abhinavan.TransactionDemoUsingHibernate.models.Address;
import com.abhinavan.TransactionDemoUsingHibernate.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService
{

    @Autowired
    private IEmployeeRepository employeeRepository;

    @Autowired
    private AddressService addressService;


    @Transactional
    public Employee addEmployee(Employee employee)
    {
        Employee savedEmployee = employeeRepository.save(employee);
        Address address = new Address();
//        Address address = null;
        address.setId(4L);
        address.setAddress("Spain");
        address.setEmployee(employee);
        addressService.saveAddress(address);
        return  savedEmployee;
    }
}
