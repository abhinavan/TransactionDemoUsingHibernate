package com.abhinavan.TransactionDemoUsingHibernate.dao;

import com.abhinavan.TransactionDemoUsingHibernate.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IAddressRepository extends JpaRepository<Address,Long> {
}
