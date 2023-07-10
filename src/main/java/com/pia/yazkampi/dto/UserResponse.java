package com.pia.yazkampi.dto;

import com.pia.yazkampi.entity.Address;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserResponse {

    private String username;
    private String name;
    private String age;
    private List<Address> addresses;
}
