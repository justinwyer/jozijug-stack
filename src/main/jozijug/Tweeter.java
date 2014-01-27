package jozijug;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class Tweeter {
    private Twitter twitter;

    public Tweeter(Twitter twitter) {
        this.twitter = twitter;
    }

    public void post(String statusUpdate) throws TwitterException {
        twitter.updateStatus("JoziJUG rocks! " + statusUpdate);
    }

    public static void main(String[] args) throws TwitterException {
        new Tweeter(TwitterFactory.getSingleton()).post("Woohoo it works!");
    }
}
