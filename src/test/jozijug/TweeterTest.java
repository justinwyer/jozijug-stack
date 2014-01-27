package jozijug;

import org.junit.Test;
import twitter4j.Twitter;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class TweeterTest {
    @Test
    public void shouldPostAStatusUpdateToTwitterWithAPrefix() throws Exception {
        Twitter twitter = mock(Twitter.class);
        new Tweeter(twitter).post("A Status Update");
        verify(twitter).updateStatus("JoziJUG rocks! A Status Update");
    }
}
