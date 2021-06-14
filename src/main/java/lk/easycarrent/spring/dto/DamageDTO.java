package lk.easycarrent.spring.dto;

import lk.easycarrent.spring.entity.Returns;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.OneToOne;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class DamageDTO {

    private String damageID;
    private double returnFee;
    private String reason;
    private Returns returnsID;

}
