package lk.easycarrent.spring.service;

import lk.easycarrent.spring.dto.AdminDTO;
import lk.easycarrent.spring.dto.CustomerDTO;

import java.util.ArrayList;

public interface AdminService {
    void addAdmin(AdminDTO dto);

    void deleteAdmin(String id);

    AdminDTO searchAdmin(String id);

    ArrayList<AdminDTO> getAllAdmins();

    void updateAdmin(AdminDTO dto);
}
