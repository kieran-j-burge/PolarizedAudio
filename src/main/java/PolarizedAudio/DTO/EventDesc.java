package PolarizedAudio.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventDesc {
    private Integer id;
    private String name;
    private String desc;
    private Date date;
}
