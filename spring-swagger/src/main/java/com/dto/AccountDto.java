package com.dto;

import java.math.BigDecimal;
import java.util.List;

import io.swagger.annotations.ApiModel;
import lombok.Data;


@Data
@ApiModel(value = "My Account Dto", description = "My Dto" )
public class AccountDto {

    private Long accountId;

    private Long customerId;

    private String country;

    private String currencyType;

    private BigDecimal availableAmount;

}
