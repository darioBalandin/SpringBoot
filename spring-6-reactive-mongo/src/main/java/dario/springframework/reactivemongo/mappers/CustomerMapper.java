 package dario.springframework.reactivemongo.mappers;

import dario.springframework.reactivemongo.domain.Customer;
import dario.springframework.reactivemongo.model.CustomerDTO;
import org.mapstruct.Mapper;


@Mapper
public interface CustomerMapper {

    CustomerDTO customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDTO customerDTO);
}
