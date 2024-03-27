package com.demo.springemail.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmailRequestDto {
    String from;
    String to;
    String subject;
    String message;
}
