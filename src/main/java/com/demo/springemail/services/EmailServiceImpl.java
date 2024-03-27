package com.demo.springemail.services;

import com.demo.springemail.dtos.EmailRequestDto;
import com.demo.springemail.dtos.MessageResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class EmailServiceImpl implements EmailService {
    JavaMailSender javaMailSender;

    @Autowired
    public EmailServiceImpl(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public MessageResponseDto sendEmail(EmailRequestDto emailRequestDto){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("fahri@gmail.com");
        message.setTo(emailRequestDto.getTo());
        message.setSubject(emailRequestDto.getSubject());
        message.setText(emailRequestDto.getMessage());

        javaMailSender.send(message);

        return new MessageResponseDto("Mail sent successfully");
    }
}
