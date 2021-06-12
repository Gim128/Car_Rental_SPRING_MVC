package lk.easycarrent.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer {
    @Id
    private String customerID;
    private String firstName;
    private String lasTName;
    private String nicNumber;
    private String driveLicenseNumber;
    private String address;
    private String contactNumber;

}
