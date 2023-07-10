package com.pia.yazkampi.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Address {

    @Id
    private String id;

    private String city;

    private String state;

}
