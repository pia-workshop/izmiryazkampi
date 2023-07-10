package com.pia.yazkampi.dto;

import com.pia.yazkampi.entity.Address;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserSaveRequest {

    private String name;

    private String username;

    private Integer age;

    private List<Address> addresses;
}
