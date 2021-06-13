package lk.easycarrent.spring.dto;

import lk.easycarrent.spring.entity.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MaintainnceDTO {
    @Id
    private String maintainID;
    private String status;
    private String reason;
    private String date;
    @ManyToOne()
    @JoinColumn(name = "vehicleID",referencedColumnName = "vehicleID")
    private Vehicle vehicle;
}
