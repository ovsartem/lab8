package adapter;

import facebook.FacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class FacebookAdapterTest {
    FacebookUser facebookUser;
    FacebookAdapter facebookAdapter;

    @BeforeEach
    void setUp() {
        facebookUser = new FacebookUser("test@gmail.com", "Ukraine", new Date());
        facebookAdapter = new FacebookAdapter(facebookUser);
    }

    @Test
    void checkAttributes() {
        assertEquals(facebookUser.getEmail(), facebookAdapter.getEmail());
        assertEquals(facebookUser.getUserCountry(), facebookAdapter.getCountry());
    }
}