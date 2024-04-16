package com.example.web.Service;

import com.example.web.dto.EventDto;
import java.util.List;
public interface EventService {
    void createEvent(Integer clubId, EventDto eventDto);
    List<EventDto> findAllEvents();
}
