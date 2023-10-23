package com.abhinavan.TransactionDemoUsingHibernate.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "emp_info")
@ToString
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String designation;
}
