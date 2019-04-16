package PolarizedAudio.Services;

import PolarizedAudio.DTO.EventDesc;

import java.util.List;

public interface EventsService {

    List<EventDesc> getAllLiveEvents();

}
