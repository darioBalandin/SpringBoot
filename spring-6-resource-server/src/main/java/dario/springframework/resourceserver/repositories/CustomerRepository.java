package dario.springframework.resourceserver.repositories;

import dario.springframework.resourceserver.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}
