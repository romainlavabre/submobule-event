package org.romainlavabre.event.subscriber;

import org.romainlavabre.event.EventSubscriber;

import java.util.List;
import java.util.Map;

public class Bcdef implements EventSubscriber {
    @Override
    public List< Enum > getEvents() {
        return List.of();
    }


    @Override
    public void receiveEvent( Enum event, Map< String, Object > params ) throws RuntimeException {

    }


    @Override
    public int getPriority() {
        return 0;
    }
}
