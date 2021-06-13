package lk.easycarrent.spring.dto;

import lk.easycarrent.spring.entity.Customer;
import lk.easycarrent.spring.entity.Driver;
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
public class RentDTO {
    @Id
    private String rentID;
    private String pickUpDate;
    private String pickOffDate;
    private String status;
    private String reason;
    private double totalFee;
    private String date;
    @ManyToOne()
    @JoinColumn(name = "customerID",referencedColumnName = "customerID")
    private Customer customer;
    @ManyToOne()
    @JoinColumn(name = "vehicleID",referencedColumnName = "vehicleID")
    private Vehicle vehicle;
    @ManyToOne()
    @JoinColumn(name = "driverID",referencedColumnName = "driverID")
    private Driver driver;
}
