package com.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "account")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class AccountEntity implements Serializable {
    @Override
    public String toString() {
        return "AccountEntity{" +
                "accountId=" + accountId +
                ", customerId=" + customerId +
                ", country='" + country + '\'' +
                ", currencyType='" + currencyType + '\'' +
                ", availableAmount=" + availableAmount +
                '}';
    }

    /**
     *
     */
    private static final long serialVersionUID = -2122134440407107064L;

    @Id
    @Column(name = "account_id", nullable = false)
    private Long accountId;

    @Column(name = "customer_id", nullable = false)
    private Long customerId;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name = "currency_type", nullable = false)
    private String currencyType;

    @Column(name = "available_amount", nullable = false)
    private BigDecimal availableAmount;



}