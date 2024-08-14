package com.resul.emailsender.controller;

import com.resul.emailsender.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/email")
public class EmailController {

    private final EmailService emailService;

    @PostMapping("/send")
    public String sendMail(@RequestParam String to,
                                           @RequestParam String subject,
                                           @RequestParam String body) {
        emailService.sendMail(to, subject, body);
        return "Email sent successfully!";
    }
}
