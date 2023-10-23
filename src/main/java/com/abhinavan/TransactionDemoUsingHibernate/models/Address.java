package com.abhinavan.TransactionDemoUsingHibernate.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "address")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String address;
    @OneToOne
    private Employee employee;
}
