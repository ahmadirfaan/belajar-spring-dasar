
package ahmadirfaanhibatullah.spring.core.listener;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: AppStartingListener.java, v 0.1 2022‐03‐13 18.46 Ahmad Irfaan Hibatullah Exp $$
 */

@Slf4j
public class AppStartingListener implements ApplicationListener<ApplicationStartedEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        log.info("Application Starting");
    }
}