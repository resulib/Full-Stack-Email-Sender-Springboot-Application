package com.resul.emailsender.controller;

import com.resul.emailsender.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/email")
public class EmailController {

    private final EmailService emailService;

    @PostMapping("/send")
    public String sendEmail(@RequestParam String to,
                            @RequestParam String subject,
                            @RequestParam String body) {
        emailService.sendEmail(to, subject, body);
        return "E-poçt uğurla göndərildi!";
    }

    @PostMapping("/sendBulk")
    public String sendBatchEmails(@RequestParam String subject,
                                  @RequestParam String body,
                                  @RequestParam("file") MultipartFile file) {
        try {
            int emailCount = emailService.sendBulkEmails(subject, body, file);
            return emailCount + " istifadəçiyə uğurla E-poçt göndərildi.";
        } catch (Exception e) {
            return "Xəta baş verdi: " + e.getMessage();
        }
    }
}