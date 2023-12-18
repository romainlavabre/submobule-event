package org.romainlavabre.event;

import org.junit.Assert;
import org.junit.Test;
import org.romainlavabre.event.subscriber.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EventSubscriberSortingTest {


    @Test
    public void test() {
        List< EventSubscriber > eventSubscribers = new ArrayList<>();
        eventSubscribers.add( new Bbcde() );
        eventSubscribers.add( new Cbcde() );
        eventSubscribers.add( new Cacde() );
        eventSubscribers.add( new Bcdef() );
        eventSubscribers.add( new Abcde() );


        List< EventSubscriber > eventSubscribersSorted = new EventDispatcherImpl().sortSubscribers( eventSubscribers );

        assertions( eventSubscribersSorted );

        Collections.reverse( eventSubscribers );

        eventSubscribersSorted = new EventDispatcherImpl().sortSubscribers( eventSubscribers );

        assertions( eventSubscribersSorted );


        eventSubscribers = new ArrayList<>();
        eventSubscribers.add( new Cbcde() );
        eventSubscribers.add( new Bbcde() );
        eventSubscribers.add( new Bcdef() );
        eventSubscribers.add( new Cacde() );
        eventSubscribers.add( new Abcde() );

        eventSubscribersSorted = new EventDispatcherImpl().sortSubscribers( eventSubscribers );

        assertions( eventSubscribersSorted );

        Collections.reverse( eventSubscribersSorted );

        eventSubscribersSorted = new EventDispatcherImpl().sortSubscribers( eventSubscribersSorted );

        assertions( eventSubscribersSorted );
    }


    private void assertions( List< EventSubscriber > eventSubscribers ) {
        Assert.assertTrue( eventSubscribers.get( 0 ) instanceof Cacde );
        Assert.assertTrue( eventSubscribers.get( 1 ) instanceof Cbcde );
        Assert.assertTrue( eventSubscribers.get( 2 ) instanceof Abcde );
        Assert.assertTrue( eventSubscribers.get( 3 ) instanceof Bbcde );
        Assert.assertTrue( eventSubscribers.get( 4 ) instanceof Bcdef );
    }


}
