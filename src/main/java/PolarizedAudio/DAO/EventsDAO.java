package PolarizedAudio.DAO;

import PolarizedAudio.DTO.EventDesc;

import java.util.List;

public interface EventsDAO {

    List<EventDesc> getAllLiveEvents();
}
