package com.demo.springemail.services;

import com.demo.springemail.dtos.EmailRequestDto;
import com.demo.springemail.dtos.MessageResponseDto;

public interface EmailService {
    MessageResponseDto sendEmail(EmailRequestDto emailRequestDto);
    MessageResponseDto sendOtp(EmailRequestDto emailRequestDto);
}
