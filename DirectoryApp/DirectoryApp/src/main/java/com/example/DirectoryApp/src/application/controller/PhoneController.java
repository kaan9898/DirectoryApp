package com.example.DirectoryApp.src.application.controller;
import com.example.DirectoryApp.src.application.business.Abstract.PhoneManager;
import com.example.DirectoryApp.src.application.domain.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class PhoneController {
    private final PhoneManager phoneManager;
    @Autowired
    public PhoneController(PhoneManager phoneManager) {this.phoneManager = phoneManager;}
    @GetMapping("getAllPhone")
    public List<Phone> getAllPhone() {
        return phoneManager.getAllPhone();
    }
}
