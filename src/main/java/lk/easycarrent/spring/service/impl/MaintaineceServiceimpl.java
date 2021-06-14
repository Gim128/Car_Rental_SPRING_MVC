package lk.easycarrent.spring.service.impl;

import lk.easycarrent.spring.exception.ValidateException;
import lk.easycarrent.spring.dto.MaintaineceDTO;
import lk.easycarrent.spring.dto.VehicleDTO;
import lk.easycarrent.spring.entity.Maintainece;
import lk.easycarrent.spring.repo.MaintaineceRepo;
import lk.easycarrent.spring.service.MaintaineceService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional

public class MaintaineceServiceimpl implements MaintaineceService {

    @Autowired
    private MaintaineceRepo maintaineceRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void addMaintainece(MaintaineceDTO dto) {
        if (maintaineceRepo.existsById(dto.getMaintainID())) {
            throw new ValidateException("Maintainece Already Exist");
        }
        maintaineceRepo.save(mapper.map(dto, Maintainece.class));
    }

    @Override
    public void deleteMaintainece(String id) {
        if (!maintaineceRepo.existsById(id)) {
            throw new ValidateException("No Maintainece for Delete..!");
        }
        maintaineceRepo.deleteById(id);

        maintaineceRepo.deleteById(id);
    }

    @Override
    public MaintaineceDTO searchMaintainece(String id) {
        Optional<Maintainece> maintainece = maintaineceRepo.findById(id);
        if (maintainece.isPresent()) {
            return mapper.map(maintainece.get(), MaintaineceDTO.class);
        }
        return null;
    }

    @Override
    public ArrayList<MaintaineceDTO> getAllMaintainece() {
        List<Maintainece> maintaineces = maintaineceRepo.findAll();
        return mapper.map(maintaineces,new TypeToken<ArrayList<VehicleDTO>>(){}.getType());
    }


    @Override
    public void updateMaintainece(MaintaineceDTO dto) {
        if (maintaineceRepo.existsById(dto.getMaintainID())) {
            maintaineceRepo.save(mapper.map(dto, Maintainece.class));
        }
    }
}
