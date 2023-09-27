package com.demo.event.domain.mapper;

import com.demo.event.api.dto.EventRequestDto;
import com.demo.event.domain.model.Event;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-27T08:39:43+0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class IEventRequestDtoMapperImpl implements IEventRequestDtoMapper {

    @Override
    public EventRequestDto to(Event obj) {
        if ( obj == null ) {
            return null;
        }

        EventRequestDto eventRequestDto = new EventRequestDto();

        eventRequestDto.setCreatedDate( obj.getCreatedDate() );
        eventRequestDto.setUpdatedDate( obj.getUpdatedDate() );
        eventRequestDto.setName( obj.getName() );
        eventRequestDto.setLocation( obj.getLocation() );
        eventRequestDto.setDesc( obj.getDesc() );
        eventRequestDto.setStartTime( obj.getStartTime() );
        eventRequestDto.setSlug( obj.getSlug() );

        return eventRequestDto;
    }

    @Override
    public Event from(EventRequestDto obj) {
        if ( obj == null ) {
            return null;
        }

        Event event = new Event();

        event.setCreatedDate( obj.getCreatedDate() );
        event.setUpdatedDate( obj.getUpdatedDate() );
        event.setName( obj.getName() );
        event.setSlug( obj.getSlug() );
        event.setDesc( obj.getDesc() );
        event.setStartTime( obj.getStartTime() );
        event.setLocation( obj.getLocation() );

        return event;
    }

    @Override
    public List<EventRequestDto> to(List<Event> entities) {
        if ( entities == null ) {
            return null;
        }

        List<EventRequestDto> list = new ArrayList<EventRequestDto>( entities.size() );
        for ( Event event : entities ) {
            list.add( to( event ) );
        }

        return list;
    }

    @Override
    public List<Event> from(List<EventRequestDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Event> list = new ArrayList<Event>( dtos.size() );
        for ( EventRequestDto eventRequestDto : dtos ) {
            list.add( from( eventRequestDto ) );
        }

        return list;
    }

    @Override
    public Set<EventRequestDto> to(Set<Event> entities) {
        if ( entities == null ) {
            return null;
        }

        Set<EventRequestDto> set = new HashSet<EventRequestDto>( Math.max( (int) ( entities.size() / .75f ) + 1, 16 ) );
        for ( Event event : entities ) {
            set.add( to( event ) );
        }

        return set;
    }

    @Override
    public Set<Event> from(Set<EventRequestDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<Event> set = new HashSet<Event>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( EventRequestDto eventRequestDto : dtos ) {
            set.add( from( eventRequestDto ) );
        }

        return set;
    }

    @Override
    public Event merge(Event target, EventRequestDto source) {
        if ( source == null ) {
            return null;
        }

        target.setCreatedDate( source.getCreatedDate() );
        target.setUpdatedDate( source.getUpdatedDate() );
        target.setName( source.getName() );
        target.setSlug( source.getSlug() );
        target.setDesc( source.getDesc() );
        target.setStartTime( source.getStartTime() );
        target.setLocation( source.getLocation() );

        return target;
    }
}
