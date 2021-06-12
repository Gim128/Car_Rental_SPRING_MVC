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

public class Vehicle {
    @Id
    private  String vehicleID;
    private  String brand;
    private  String model;
    private  String type;
    private  String frontView;
    private  String backView;
    private  String sideView;
    private  String interiorView;
    private  double regNo;
    private  String color;
    private  String transmissionType;
    private  String fuelType;
    private  double dailyRent;
    private  double monthlyRent;
    private  String dailyKm;

}
