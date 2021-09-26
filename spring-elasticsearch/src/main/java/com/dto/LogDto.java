package com.dto;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class LogDto {

    private String serviceName;

    private String logText;

    private Date logDate;


}
