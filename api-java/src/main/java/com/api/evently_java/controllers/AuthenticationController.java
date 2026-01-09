package com.api.evently_java.controllers;

import com.api.evently_java.dto.RegisterDTO;
import com.api.evently_java.dto.RegisterResponseDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@Slf4j
@RequiredArgsConstructor
public class AuthenticationController {

    public ResponseEntity<RegisterResponseDTO> register(RegisterDTO registerDTO) {
        log.info("AuthenticationController.register - Start - INPUT - registerDTO: {}", registerDTO);

        RegisterResponseDTO response = new RegisterResponseDTO();
        log.info("AuthenticationController.register - End - INPUT - response: {}", response);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
