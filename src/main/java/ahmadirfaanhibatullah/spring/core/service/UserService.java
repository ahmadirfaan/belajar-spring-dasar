package ahmadirfaanhibatullah.spring.core.service;

import ahmadirfaanhibatullah.spring.core.data.User;
import ahmadirfaanhibatullah.spring.core.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: UserService.java, v 0.1 2022‐03‐13 17.41 Ahmad Irfaan Hibatullah Exp $$
 */

@Slf4j
@Component
public class UserService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    /**
     * Setter method for property applicationEventPublisher.
     *
     * @param applicationEventPublisher value to be assigned to property applicationEventPublisher
     */
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public boolean login(String username, String password) {
        if(isLoginSuccess(username, password)) {
            log.info("Success publish event");
            applicationEventPublisher.publishEvent(new LoginSuccessEvent(new User(username)));
            return true;
        } else {
            log.info("Fail publish event");
            return false;
        }
    }

    private boolean isLoginSuccess(String username, String password) {
        return "ahmadirfaan".equals(username) && "ahmadirfaan".equals(password);
    }
}