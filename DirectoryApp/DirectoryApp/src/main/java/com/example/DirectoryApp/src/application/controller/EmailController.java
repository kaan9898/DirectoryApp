package com.example.DirectoryApp.src.application.controller;
import com.example.DirectoryApp.src.application.business.Abstract.EmailManager;
import com.example.DirectoryApp.src.application.domain.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class EmailController {
    private final EmailManager emailManager;
    @Autowired
    public EmailController(EmailManager emailManager) {
        this.emailManager = emailManager;
    }
    @GetMapping("getAllEmails")
    public List<Email> getAllEmail(){
        return emailManager.getAllEmail();
    }
}
