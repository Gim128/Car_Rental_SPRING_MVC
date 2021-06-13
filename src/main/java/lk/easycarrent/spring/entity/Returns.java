package lk.easycarrent.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

//@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Returns {
    @Id
    private  String returnID;
    private  String returnFee;
    private  String reason;
}
