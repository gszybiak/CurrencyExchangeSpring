package spring.currencyexchangespring.repository;

import org.springframework.data.repository.CrudRepository;
import spring.currencyexchangespring.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
