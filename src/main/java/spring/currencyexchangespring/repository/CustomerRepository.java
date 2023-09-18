package spring.currencyexchangespring.repository;

import org.springframework.data.repository.CrudRepository;
import spring.currencyexchangespring.model.Customer;

interface CustomerRepository extends CrudRepository<Customer, Long> {
}
