package facebook;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter @AllArgsConstructor
public class FacebookUser {
    private String Email;
    private String UserCountry;
    private Date UserActiveTime;
}
