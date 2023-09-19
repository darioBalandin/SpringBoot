package dario.springframework.spring6restmvc.controllers;

import dario.springframework.spring6restmvc.model.CustomerDto;
import dario.springframework.spring6restmvc.repositories.CustomerRepository;
import jakarta.transaction.Transactional;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class CustomerControllerIT {

    @Autowired
    CustomerController customerController;
    @Autowired
    CustomerRepository customerRepository;


    @Test
    @Transactional
    @Rollback
    void testListEmpty() {
        customerRepository.deleteAll();
        List<CustomerDto> dtos= customerController.listAllCustomers();
        Assertions.assertThat(dtos.size()).isEqualTo(0);
    }

    @Test
    void testListCustomers() {
        List<CustomerDto> dtos= customerController.listAllCustomers();
        Assertions.assertThat(dtos.size()).isEqualTo(3);
    }

    @Test
    void testCustomerNotFound() {
        assertThrows(NotFoundException.class, () -> customerController.getCustomerById(UUID.randomUUID()));
    }

    @Test
    void testCustomerById() {

        CustomerDto dto= customerController.getCustomerById(customerRepository.findAll().get(0).getId());

        Assertions.assertThat(dto).isNotNull();
    }
}