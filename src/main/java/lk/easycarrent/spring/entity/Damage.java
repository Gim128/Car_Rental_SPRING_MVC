package lk.easycarrent.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Damage {
    @Id
    private String damageID;
    private double returnFee;
    private String reason;
}
