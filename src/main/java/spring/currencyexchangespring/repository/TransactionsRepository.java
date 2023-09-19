package spring.currencyexchangespring.repository;

import org.springframework.data.repository.CrudRepository;
import spring.currencyexchangespring.model.Transaction;
interface TransactionsRepository extends CrudRepository<Transaction, Long> {
}
