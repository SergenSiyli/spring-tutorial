package com.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class CustomerEntity implements Serializable {


    @Id
    private Long customerId;
    private Long customerCompanyId;
    private String identityNumber;
    private String  nationality;
    private String  phoneNumber;
    private String  address;
}
