package lk.easycarrent.spring.dto;

import lk.easycarrent.spring.entity.Driver;
import lk.easycarrent.spring.entity.Rent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.OneToOne;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ScheduleDTO {

    private String scheduleID;

    private Rent rentID;

    private Driver driverID;
}
