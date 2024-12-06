package com.example.DirectoryApp.src.application.business.Abstract;
import com.example.DirectoryApp.src.application.domain.Phone;
import java.util.List;

public interface PhoneManager {
    public String editPhoneNumber();
    public List<Phone> getAllPhone();
}
