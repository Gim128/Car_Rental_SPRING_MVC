package lk.easycarrent.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Rent {
    @Id
    private String rentID;
    private String pickUpDate;
    private String pickOffDate;
    private String status;
    private String reason;
    private double totalFee;
    private String date;
    @ManyToOne()
    @JoinColumn(name = "customer_",referencedColumnName = "customerID")
    private Customer customer;
    @ManyToOne()
    @JoinColumn(name = "vehicle_",referencedColumnName = "vehicleID")
    private Vehicle vehicle;
}

