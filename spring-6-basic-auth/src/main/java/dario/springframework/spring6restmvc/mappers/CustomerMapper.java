package dario.springframework.spring6restmvc.mappers;

import dario.springframework.spring6restmvc.model.CustomerDTO;
import dario.springframework.spring6restmvc.entities.Customer;
import org.mapstruct.Mapper;


@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);

}
