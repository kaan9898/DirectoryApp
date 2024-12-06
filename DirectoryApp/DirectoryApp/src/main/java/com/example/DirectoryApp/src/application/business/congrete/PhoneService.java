package com.example.DirectoryApp.src.application.business.congrete;
import com.example.DirectoryApp.src.application.business.Abstract.PhoneManager;
import com.example.DirectoryApp.src.application.domain.Phone;
import com.example.DirectoryApp.src.application.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PhoneService implements PhoneManager {
    @Autowired
    private final PhoneRepository phoneRepository;

    public PhoneService(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    @Override
    public String editPhoneNumber() {
        return "";
    }

    @Override
    public List<Phone> getAllPhone() {
        return phoneRepository.findAll();
    }
}
