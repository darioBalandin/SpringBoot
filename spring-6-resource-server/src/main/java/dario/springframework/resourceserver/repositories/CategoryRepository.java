package dario.springframework.resourceserver.repositories;

import dario.springframework.resourceserver.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
