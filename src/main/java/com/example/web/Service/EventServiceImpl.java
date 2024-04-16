package com.example.web.Service;

import com.example.web.Model.Club;
import com.example.web.Model.Event;
import com.example.web.Repository.ClubRepository;
import com.example.web.Repository.EventRepository;
import com.example.web.dto.EventDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.example.web.mapper.EventMapper.mapToEvent;
import static com.example.web.mapper.EventMapper.mapToEventDto;

@Service
public class EventServiceImpl implements EventService{
    private EventRepository eventRepository;
    private ClubRepository clubRepository;

    public EventServiceImpl(EventRepository eventRepository, ClubRepository clubRepository) {
        this.eventRepository = eventRepository;
        this.clubRepository = clubRepository;
    }

    @Override
    public void createEvent(Integer clubId, EventDto eventDto) {
        Club club = clubRepository.findById(clubId).get();
        Event event = mapToEvent(eventDto);
        event.setClub(club);
        eventRepository.save(event);
    }

    @Override
    public List<EventDto> findAllEvents() {
        List<Event> events = eventRepository.findAll();
        return events.stream().map(event -> mapToEventDto(event)).collect(Collectors.toList());
    }


}
