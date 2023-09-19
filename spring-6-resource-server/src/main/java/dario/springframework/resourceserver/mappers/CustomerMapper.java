package dario.springframework.resourceserver.mappers;

import dario.springframework.resourceserver.entities.Customer;
import dario.springframework.resourceserver.model.CustomerDTO;
import org.mapstruct.Mapper;


@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);

}
