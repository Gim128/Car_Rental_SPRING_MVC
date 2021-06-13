package lk.easycarrent.spring.dto;

import lk.easycarrent.spring.entity.Rent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DriverDTO {
    private String driverId;
    private String firstName;
    private String lastName;
    private String address;
    private String contatNumber;
    private String nic;
    @OneToMany(mappedBy = "driver",cascade = {CascadeType.ALL})
    private List<Rent> rentOrder;
}
