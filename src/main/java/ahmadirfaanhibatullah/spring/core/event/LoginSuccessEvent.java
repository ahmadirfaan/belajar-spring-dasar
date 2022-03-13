package ahmadirfaanhibatullah.spring.core.event;

import ahmadirfaanhibatullah.spring.core.data.User;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: LoginSuccessEvent.java, v 0.1 2022‐03‐13 17.37 Ahmad Irfaan Hibatullah Exp $$
 */
public class LoginSuccessEvent extends ApplicationEvent {

    @Getter
    private final User user;

    public LoginSuccessEvent(User user) {
        super(user);
        this.user = user;
    }
}