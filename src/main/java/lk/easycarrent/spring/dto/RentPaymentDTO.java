package lk.easycarrent.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RentPaymentDTO {

    private String rentID;
    private String date;
    private double fee;
    private String method;
}
