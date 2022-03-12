package ahmadirfaanhibatullah.spring.core.data;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: Server.java, v 0.1 2022‐03‐13 04.22 Ahmad Irfaan Hibatullah Exp $$
 */

@Slf4j
public class Server {

    @PostConstruct
    public void start() {
        log.info("Start Server");
    }

    @PreDestroy
    public void stop() {
        log.info("Stop Server");
    }
}