package com.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.atomic.LongAdder;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "account")
@Getter
@Setter
public class Account implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 100, name = "customer_no")
    private String customerNo;

    @Column(length = 100, name = "name")
    private String name;

    @Column(length = 100, name = "surname")
    private String surname;

    @Column(length = 100, name = "nationality_number")
    private String nationalityNumber;
}