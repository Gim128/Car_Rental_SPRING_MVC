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
public class Driver {
    @Id
    private String driverId;
    private String firstName;
    private String lastName;
    private String email;
    private String contatNumber;
}
