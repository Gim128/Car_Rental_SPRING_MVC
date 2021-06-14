package lk.easycarrent.spring.service.impl;

import lk.easycarrent.spring.dto.DriverDTO;
import lk.easycarrent.spring.service.DriverService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional

public class DriverServiceimpl implements DriverService {
    @Override
    public void addDriver(DriverDTO dto) {

    }

    @Override
    public void deleteDriver(String id) {

    }

    @Override
    public DriverDTO searchDriver(String id) {
        return null;
    }

    @Override
    public ArrayList<DriverDTO> getAllDriver() {
        return null;
    }

    @Override
    public void updateDriver(DriverDTO dto) {

    }
}
