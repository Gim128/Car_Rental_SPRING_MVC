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
public class maintaince {
    @Id
    private String maintainID;
    private String status;
    private String reason;
    private String date;
}