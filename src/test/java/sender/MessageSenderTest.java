package sender;

import adapter.FacebookAdapter;
import adapter.TwitterAdapter;
import facebook.FacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twitter.TwitterUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MessageSenderTest {
    TwitterAdapter tweeterUser;
    FacebookAdapter facebookUser;
    MessageSender sender;

    @BeforeEach
    void setUp() {
        tweeterUser = new TwitterAdapter(new TwitterUser("test@gmail.com", "Ukraine", new Date()));
        facebookUser = new FacebookAdapter(new FacebookUser("test1@gmail.com", "Russia", new Date()));
        sender = new MessageSender();
    }

    @Test
    void testSender() {
        assertTrue(sender.send("message", tweeterUser, "Ukraine"));
        assertFalse(sender.send("message", facebookUser, "USA"));
    }
}