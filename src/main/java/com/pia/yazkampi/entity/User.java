package com.pia.yazkampi.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document
@Data
public class User {

    @Id
    private String id;

    private String name;

    private String username;

    private int age;

    private List<Address> adresses;

    private LocalDateTime createdDate;
    
}
