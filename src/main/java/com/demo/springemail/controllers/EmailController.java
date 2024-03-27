package com.demo.springemail.controllers;

import com.demo.springemail.dtos.EmailRequestDto;
import com.demo.springemail.dtos.MessageResponseDto;
import com.demo.springemail.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {
    EmailService emailService;

    @Autowired
    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping
    public ResponseEntity<MessageResponseDto> sendEmail(@RequestBody EmailRequestDto emailRequestDto){
        return ResponseEntity.ok(emailService.sendEmail(emailRequestDto));
    }
}
