package ahmadirfaanhibatullah.spring.core.listener;

import ahmadirfaanhibatullah.spring.core.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: LoginSuccessListener.java, v 0.1 2022‐03‐13 17.39 Ahmad Irfaan Hibatullah Exp $$
 */

@Slf4j
@Component
public class LoginSuccessListener implements ApplicationListener<LoginSuccessEvent> {


    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        log.info("Success login for user {}", event.getUser());
    }
}