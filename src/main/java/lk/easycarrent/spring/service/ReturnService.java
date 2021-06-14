package lk.easycarrent.spring.service;

import lk.easycarrent.spring.dto.RentDTO;
import lk.easycarrent.spring.dto.ReturnsDTO;

import java.util.ArrayList;

public interface ReturnService {
    void addReturn(ReturnsDTO dto);

    void deleteReturn(String id);

    ReturnsDTO searchReturn(String id);

    ArrayList<ReturnsDTO> getAllReturn();

    void updateReturn(ReturnsDTO dto);
}
