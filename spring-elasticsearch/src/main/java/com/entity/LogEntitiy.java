package com.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

@Document(indexName = "logs", type = "log")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LogEntitiy {

    @Id
    private String id;

    @Field(name = "servicename", type = FieldType.Text)
    private String serviceName;

    @Field(name = "logtext", type = FieldType.Text)
    private String logText;

    @Field(name = "logdate", type = FieldType.Date)
    private Date logDate;

}
