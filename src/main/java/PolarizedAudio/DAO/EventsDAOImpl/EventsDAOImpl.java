package PolarizedAudio.DAO.EventsDAOImpl;

import PolarizedAudio.DAO.EventsDAO;
import PolarizedAudio.DTO.EventDesc;
import PolarizedAudio.Services.EventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EventsDAOImpl implements EventsDAO {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public EventsDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<EventDesc> getAllLiveEvents() {
        try {
            List<EventDesc> eventList = new ArrayList<>();
            jdbcTemplate.query("SELECT event_id,name,short_desc,date FROM events ORDER BY date DESC;",
                    new Object[]{},
                    (rs, rowNum) -> eventList.add(new EventDesc(
                            rs.getInt("event_id"),
                            rs.getString("name"),
                            rs.getString("short_desc"),
                            rs.getDate("date"))
                    ));
            System.out.println("done");
            return eventList;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }
}
