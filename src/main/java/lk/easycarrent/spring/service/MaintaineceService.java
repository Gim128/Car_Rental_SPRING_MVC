package lk.easycarrent.spring.service;

import lk.easycarrent.spring.dto.DriverDTO;
import lk.easycarrent.spring.dto.MaintaineceDTO;

import java.util.ArrayList;

public interface MaintaineceService {
    void addMaintainece(MaintaineceDTO dto);

    void deleteMaintainece(String id);

    MaintaineceDTO searchMaintainece(String id);

    ArrayList<MaintaineceDTO> getAllMaintainece();

    void updateMaintainece(MaintaineceDTO dto);
}
