package lk.easycarrent.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReturnsDTO {
    @Id
    private  String returnID;
    private  String returnFee;
    private  String reason;
}
