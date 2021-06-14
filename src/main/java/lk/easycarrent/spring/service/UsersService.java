package lk.easycarrent.spring.service;

import lk.easycarrent.spring.dto.ScheduleDTO;
import lk.easycarrent.spring.dto.UsersDTO;

import java.util.ArrayList;

public interface UsersService {
    void addUsers(UsersDTO dto);

    void deleteUsers(String id);

    UsersDTO searchUsers(String id);

    ArrayList<UsersDTO> getAllUsers();

    void updateUsers(UsersDTO dto);
}
