package lk.easycarrent.spring.dto;

import lk.easycarrent.spring.entity.Rent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerDTO {
    @Id
    private String customerID;
    private String firstName;
    private String lasTName;
    private String nicNumber;
    private String driveLicenseNumber;
    private String address;
    private String contactNumber;
    @OneToMany(mappedBy = "customer",cascade = {CascadeType.ALL})
    private List<Rent> rentOrder;
}
