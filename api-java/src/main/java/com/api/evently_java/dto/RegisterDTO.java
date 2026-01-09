package com.api.evently_java.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RegisterDTO {
    private String name;
    private String email;
    private String password;
}
