package adapter;

import facebook.FacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twitter.TwitterUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TwitterAdapterTest {
    TwitterUser tweeterUser;
    TwitterAdapter tweeterAdapter;

    @BeforeEach
    void setUp() {
        tweeterUser = new TwitterUser("test@gmail.com", "Ukraine", new Date());
        tweeterAdapter = new TwitterAdapter(tweeterUser);
    }

    @Test
    void checkAttributes() {
        assertEquals(tweeterUser.getEmail(), tweeterAdapter.getEmail());
        assertEquals(tweeterUser.getUserCountry(), tweeterAdapter.getCountry());
    }
}