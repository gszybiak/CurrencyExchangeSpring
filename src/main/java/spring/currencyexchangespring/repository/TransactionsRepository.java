package spring.currencyexchangespring.repository;

import org.springframework.data.repository.CrudRepository;
import spring.currencyexchangespring.model.Transactions;

interface TransactionsRepository extends CrudRepository<Transactions, Long> {
}
