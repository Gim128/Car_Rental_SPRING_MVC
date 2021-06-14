package lk.easycarrent.spring.service.impl;

import lk.easycarrent.spring.exception.ValidateException;
import lk.easycarrent.spring.dto.ScheduleDTO;
import lk.easycarrent.spring.dto.VehicleDTO;
import lk.easycarrent.spring.entity.Schedule;
import lk.easycarrent.spring.repo.ScheduleRepo;
import lk.easycarrent.spring.service.ScheduleService;
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

public class ScheduleServiceimpl implements ScheduleService {

    @Autowired
    private ScheduleRepo scheduleRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void addSchedule(ScheduleDTO dto) {
        if (scheduleRepo.existsById(dto.getScheduleID())) {
            throw new ValidateException("Schedule Already Exist");
        }
        scheduleRepo.save(mapper.map(dto, Schedule.class));
    }

    @Override
    public void deleteSchedule(String id) {
        if (!scheduleRepo.existsById(id)) {
            throw new ValidateException("No Schedule for Delete..!");
        }
        scheduleRepo.deleteById(id);

        scheduleRepo.deleteById(id);
    }

    @Override
    public ScheduleDTO searchSchedule(String id) {
        Optional<Schedule> schedule = scheduleRepo.findById(id);
        if (schedule.isPresent()) {
            return mapper.map(schedule.get(), ScheduleDTO.class);
        }
        return null;
    }

    @Override
    public ArrayList<ScheduleDTO> getAllSchedule() {
        List<Schedule> schedule = scheduleRepo.findAll();
        return mapper.map(schedule,new TypeToken<ArrayList<VehicleDTO>>(){}.getType());
    }

    @Override
    public void updateSchedule(ScheduleDTO dto) {
        if (scheduleRepo.existsById(dto.getScheduleID())) {
            scheduleRepo.save(mapper.map(dto, Schedule.class));
        }
    }
}
