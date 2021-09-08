package com.andrei.sfgrestbrewery.web.mappers;

import com.andrei.sfgrestbrewery.domain.Customer;
import com.andrei.sfgrestbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

/**
 * Created by jt on 2019-05-25.
 */
@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDto dto);

    CustomerDto customerToCustomerDto(Customer customer);
}
