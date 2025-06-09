package ma.enset.digitalbanking.repositories;

import ma.enset.digitalbanking.Entities.Customer;
import org.springframework.data.repository.support.Repositories;

import java.lang.ScopedValue;
import java.util.List;

public interface CustomerRepository {
    Customer save(Customer customer);
    
    List<Customer> findAll();

    Customer findById(Long customerId);
}
