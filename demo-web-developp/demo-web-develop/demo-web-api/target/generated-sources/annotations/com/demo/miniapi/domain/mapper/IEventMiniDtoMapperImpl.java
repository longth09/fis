package com.demo.miniapi.domain.mapper;

import com.demo.event.domain.model.Event;
import com.demo.miniapi.api.dto.EventMinniResDto;
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
public class IEventMiniDtoMapperImpl implements IEventMiniDtoMapper {

    @Override
    public EventMinniResDto to(Event obj) {
        if ( obj == null ) {
            return null;
        }

        EventMinniResDto eventMinniResDto = new EventMinniResDto();

        eventMinniResDto.setId( obj.getId() );
        eventMinniResDto.setName( obj.getName() );
        eventMinniResDto.setSlug( obj.getSlug() );

        return eventMinniResDto;
    }

    @Override
    public Event from(EventMinniResDto obj) {
        if ( obj == null ) {
            return null;
        }

        Event event = new Event();

        event.setId( obj.getId() );
        event.setName( obj.getName() );
        event.setSlug( obj.getSlug() );

        return event;
    }

    @Override
    public List<EventMinniResDto> to(List<Event> entities) {
        if ( entities == null ) {
            return null;
        }

        List<EventMinniResDto> list = new ArrayList<EventMinniResDto>( entities.size() );
        for ( Event event : entities ) {
            list.add( to( event ) );
        }

        return list;
    }

    @Override
    public List<Event> from(List<EventMinniResDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Event> list = new ArrayList<Event>( dtos.size() );
        for ( EventMinniResDto eventMinniResDto : dtos ) {
            list.add( from( eventMinniResDto ) );
        }

        return list;
    }

    @Override
    public Set<EventMinniResDto> to(Set<Event> entities) {
        if ( entities == null ) {
            return null;
        }

        Set<EventMinniResDto> set = new HashSet<EventMinniResDto>( Math.max( (int) ( entities.size() / .75f ) + 1, 16 ) );
        for ( Event event : entities ) {
            set.add( to( event ) );
        }

        return set;
    }

    @Override
    public Set<Event> from(Set<EventMinniResDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<Event> set = new HashSet<Event>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( EventMinniResDto eventMinniResDto : dtos ) {
            set.add( from( eventMinniResDto ) );
        }

        return set;
    }

    @Override
    public Event meger(Event target, EventMinniResDto source) {
        if ( source == null ) {
            return null;
        }

        target.setName( source.getName() );
        target.setSlug( source.getSlug() );

        return target;
    }
}
