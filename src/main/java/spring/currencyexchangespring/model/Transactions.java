package spring.currencyexchangespring.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name="transactions")
public class Transactions {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "userId", unique = true)
    private Customer customer;
    private LocalDate transactionDate;
    private BigDecimal amount;
    private String currency;
    private String transactionType;
    private int exchangeRate;
}
