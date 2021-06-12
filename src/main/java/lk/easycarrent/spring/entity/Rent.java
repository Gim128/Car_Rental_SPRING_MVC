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
public class Rent {
    @Id
    private String rentID;
    private boolean isDriver;
    private String pickUpDate;
    private String pickOffDate;
    private String status;
    private String reason;
    private double totalFee;
    private String date;
}