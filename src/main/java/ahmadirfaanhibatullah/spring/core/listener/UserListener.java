package ahmadirfaanhibatullah.spring.core.listener;

import ahmadirfaanhibatullah.spring.core.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: UserListener.java, v 0.1 2022‐03‐13 17.52 Ahmad Irfaan Hibatullah Exp $$
 */

@Slf4j
@Component
public class UserListener {

    @EventListener(classes = LoginSuccessEvent.class)
    public void onSuccessLoginEvent(LoginSuccessEvent event) {
        log.info("Success login user listener 1 for user {}", event.getUser());
    }

    @EventListener(classes = LoginSuccessEvent.class)
    public void onSuccessLoginEvent2(LoginSuccessEvent event) {
        log.info("Success login user listener  2 for user {}", event.getUser());
    }

    @EventListener(classes = LoginSuccessEvent.class)
    public void onSuccessLoginEvent3(LoginSuccessEvent event) {
        log.info("Success login user listener  3 for user {}", event.getUser());
    }
}