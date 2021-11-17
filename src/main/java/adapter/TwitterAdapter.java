package adapter;

import lombok.Setter;
import twitter.TwitterUser;

import java.util.Date;

@Setter
public class TwitterAdapter implements User{
    private TwitterUser user;

    public TwitterAdapter(TwitterUser twitterUser) {
        this.user = twitterUser;
    }

    public String getEmail(){
        return user.getEmail();
    }

    public String getCountry(){
        return user.getUserCountry();
    }

    public Date getDate() {
        return user.getUserActiveTime();
    }
}

