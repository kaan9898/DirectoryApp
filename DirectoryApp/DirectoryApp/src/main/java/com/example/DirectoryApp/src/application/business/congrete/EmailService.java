package com.example.DirectoryApp.src.application.business.congrete;
import com.example.DirectoryApp.src.application.business.Abstract.EmailManager;
import com.example.DirectoryApp.src.application.domain.Email;
import com.example.DirectoryApp.src.application.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmailService implements EmailManager{
    @Autowired
    private final EmailRepository emailRepository;

    public EmailService(EmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }

    @Override
    public String editEmail() {
        return "";
    }

    @Override
    public List<Email> getAllEmail() {
        return emailRepository.findAll();
    }
}
