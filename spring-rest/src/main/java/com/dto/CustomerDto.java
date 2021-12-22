package com.dto;
import lombok.Data;

@Data
public class CustomerDto {

    private Long customerId;
    private Long customerCompanyId;
    private String identityNumber;
    private String  nationality;
    private String  phoneNumber;
    private String  address;
}
