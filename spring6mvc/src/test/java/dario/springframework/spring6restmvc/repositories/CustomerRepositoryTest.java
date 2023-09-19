package dario.springframework.spring6restmvc.repositories;

import dario.springframework.spring6restmvc.entities.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CustomerRepositoryTest {


    @Autowired
    CustomerRepository customerRepository;

    @Test

    void testSaveCustomer(){
        Customer savedCustomer = customerRepository.save(Customer.builder().name("Customer1").build());

        assertThat(savedCustomer).isNotNull();
        assertThat(savedCustomer.getId()).isNotNull();

    }
}