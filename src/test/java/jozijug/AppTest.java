package jozijug;

import org.junit.Before;
import org.junit.Test;
import twitter4j.Twitter;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AppTest {

    private Tweeter tweeter;
    private Twitter twitter;

    @Before
    public void setUp() throws Exception {
        twitter = mock(Twitter.class);
        tweeter = new Tweeter(twitter);
    }

    @Test
    public void shouldCreateATweet() throws Exception {
        tweeter.post("Hello from here!");
        verify(twitter).updateStatus("Hello from here!");
    }

    @Test
    public void shouldFailToCreateATweet() throws Exception {
        tweeter.post("Hello from here!");
        verify(twitter).updateStatus("Hello from here...");
    }
}
