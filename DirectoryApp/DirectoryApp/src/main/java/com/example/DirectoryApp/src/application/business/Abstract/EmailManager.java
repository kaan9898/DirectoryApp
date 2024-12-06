package com.example.DirectoryApp.src.application.business.Abstract;
import com.example.DirectoryApp.src.application.domain.Email;
import java.util.List;

public interface EmailManager {
    String editEmail();
    List<Email> getAllEmail();
}
