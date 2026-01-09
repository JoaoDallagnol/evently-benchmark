package com.api.evently_java.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.ZonedDateTime;

@Getter
@Setter
@ToString
public class RegisterResponseDTO {
    private String id;
    private String name;
    private String email;
    private ZonedDateTime createdAt;
}
