package ahmadirfaanhibatullah.spring.core.data;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: Connection.java, v 0.1 2022‐03‐13 04.14 Ahmad Irfaan Hibatullah Exp $$
 */

@Slf4j
public class Connection implements InitializingBean, DisposableBean {

    public void destroy() {
        log.info("Connection is closed");
    }

    @Override
    public void afterPropertiesSet() {
        log.info("Connection is ready to be used");
    }
}