package PolarizedAudio.Services.ServicesImpl;

import PolarizedAudio.DAO.EventsDAO;
import PolarizedAudio.DTO.EventDesc;
import PolarizedAudio.Services.EventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventsServiceImpl implements EventsService{

    private EventsDAO eventsDAO;

    @Autowired
    public EventsServiceImpl(EventsDAO eventsDAO) {
        this.eventsDAO = eventsDAO;
    }

    @Override
    public List<EventDesc> getAllLiveEvents() {
        return eventsDAO.getAllLiveEvents();
    }
}
