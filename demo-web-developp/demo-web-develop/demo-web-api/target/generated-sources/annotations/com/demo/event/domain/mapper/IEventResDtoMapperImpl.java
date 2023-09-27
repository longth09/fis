package com.demo.event.domain.mapper;

import com.demo.event.api.dto.EventResDto;
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
public class IEventResDtoMapperImpl implements IEventResDtoMapper {

    @Override
    public EventResDto to(Event obj) {
        if ( obj == null ) {
            return null;
        }

        EventResDto eventResDto = new EventResDto();

        eventResDto.setCreatedDate( obj.getCreatedDate() );
        eventResDto.setUpdatedDate( obj.getUpdatedDate() );
        eventResDto.setId( obj.getId() );
        eventResDto.setName( obj.getName() );
        eventResDto.setDesc( obj.getDesc() );

        return eventResDto;
    }

    @Override
    public Event from(EventResDto obj) {
        if ( obj == null ) {
            return null;
        }

        Event event = new Event();

        event.setCreatedDate( obj.getCreatedDate() );
        event.setUpdatedDate( obj.getUpdatedDate() );
        event.setId( obj.getId() );
        event.setName( obj.getName() );
        event.setDesc( obj.getDesc() );

        return event;
    }

    @Override
    public List<EventResDto> to(List<Event> entities) {
        if ( entities == null ) {
            return null;
        }

        List<EventResDto> list = new ArrayList<EventResDto>( entities.size() );
        for ( Event event : entities ) {
            list.add( to( event ) );
        }

        return list;
    }

    @Override
    public List<Event> from(List<EventResDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Event> list = new ArrayList<Event>( dtos.size() );
        for ( EventResDto eventResDto : dtos ) {
            list.add( from( eventResDto ) );
        }

        return list;
    }

    @Override
    public Set<EventResDto> to(Set<Event> entities) {
        if ( entities == null ) {
            return null;
        }

        Set<EventResDto> set = new HashSet<EventResDto>( Math.max( (int) ( entities.size() / .75f ) + 1, 16 ) );
        for ( Event event : entities ) {
            set.add( to( event ) );
        }

        return set;
    }

    @Override
    public Set<Event> from(Set<EventResDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<Event> set = new HashSet<Event>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( EventResDto eventResDto : dtos ) {
            set.add( from( eventResDto ) );
        }

        return set;
    }

    @Override
    public Event merge(Event target, EventResDto source) {
        if ( source == null ) {
            return null;
        }

        target.setCreatedDate( source.getCreatedDate() );
        target.setUpdatedDate( source.getUpdatedDate() );
        target.setName( source.getName() );
        target.setDesc( source.getDesc() );

        return target;
    }
}
