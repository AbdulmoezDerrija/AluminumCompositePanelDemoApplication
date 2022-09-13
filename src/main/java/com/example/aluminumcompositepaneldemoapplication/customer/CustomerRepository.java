package com.example.aluminumcompositepaneldemoapplication.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query("SELECT s FROM Customer s WHERE s.email = ?1")
    Optional<Customer> findCustomerByEmail(String email);

    @Query(
            value = "SELECT * FROM USERS u WHERE u.status = 1",
            nativeQuery = true)
    Collection<Customer> findAllActiveCustomersNative();

}
