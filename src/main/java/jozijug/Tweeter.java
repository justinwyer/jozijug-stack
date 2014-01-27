package jozijug;

import twitter4j.Twitter;
import twitter4j.TwitterException;

public class Tweeter {

    private Twitter twitter;

    public Tweeter(Twitter twitter) {

        this.twitter = twitter;
    }

    public void post(String message) throws TwitterException {
        twitter.updateStatus(message);
    }
}
