package jozijug;

import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class App {
    public static void main(String[] args) throws TwitterException {
        Tweeter tweeter = new Tweeter(TwitterFactory.getSingleton());
        tweeter.post("JoziJug Demo - Hello from main!");
    }
}
