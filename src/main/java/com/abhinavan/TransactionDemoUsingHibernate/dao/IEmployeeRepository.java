package com.abhinavan.TransactionDemoUsingHibernate.dao;

import com.abhinavan.TransactionDemoUsingHibernate.models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface IEmployeeRepository extends CrudRepository<Employee, Integer> {
}
