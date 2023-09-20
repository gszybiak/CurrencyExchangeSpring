package spring.currencyexchangespring.model;

import jakarta.persistence.*;

@Entity
@Table(name="customers")
public class Customer {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "id", unique = true)
    private User userId;
    private String name;
    private String surname;
    private String email;
    private String address;
    private Long phoneNumber;
}
