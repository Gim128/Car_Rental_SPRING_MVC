package lk.easycarrent.spring.service.impl;

import lk.easycarrent.spring.exception.ValidateException;
import lk.easycarrent.spring.dto.RentPaymentDTO;
import lk.easycarrent.spring.dto.VehicleDTO;
import lk.easycarrent.spring.entity.RentPayment;
import lk.easycarrent.spring.repo.RentPaymentRepo;
import lk.easycarrent.spring.service.RentPaymentService;
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

public class RentPaymentServiceimpl implements RentPaymentService {

    @Autowired
    private RentPaymentRepo rentPaymentRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void addRentPayment(RentPaymentDTO dto) {
        if (rentPaymentRepo.existsById(dto.getRentID())) {
            throw new ValidateException("Customer Already Exist");
        }
        rentPaymentRepo.save(mapper.map(dto, RentPayment.class));
    }

    @Override
    public void deleteRentPayment(String id) {
        if (!rentPaymentRepo.existsById(id)) {
            throw new ValidateException("No Rent for Delete..!");
        }
        rentPaymentRepo.deleteById(id);

        rentPaymentRepo.deleteById(id);
    }

    @Override
    public RentPaymentDTO searchRentPayment(String id) {
        Optional<RentPayment> rentPayment = rentPaymentRepo.findById(id);
        if (rentPayment.isPresent()) {
            return mapper.map(rentPayment.get(), RentPaymentDTO.class);
        }
        return null;
    }

    @Override
    public ArrayList<RentPaymentDTO> getAllRentPayment() {
        List<RentPayment> rentPayments = rentPaymentRepo.findAll();
        return mapper.map(rentPayments,new TypeToken<ArrayList<VehicleDTO>>(){}.getType());
    }

    @Override
    public void updateRentPayment(RentPaymentDTO dto) {
        if (rentPaymentRepo.existsById(dto.getRentID())) {
            rentPaymentRepo.save(mapper.map(dto, RentPayment.class));
        }
    }
}
