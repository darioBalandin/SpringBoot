package dario.springframework.resourceserver.repositories;

import dario.springframework.resourceserver.entities.BeerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface BeerOrderRepository extends JpaRepository<BeerOrder, UUID> {
}
