package ahmadirfaanhibatullah.spring.core.service;

import lombok.Getter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: AuthService.java, v 0.1 2022‐03‐13 06.17 Ahmad Irfaan Hibatullah Exp $$
 */

@Component
public class AuthService implements ApplicationContextAware, BeanNameAware {

    @Getter
    private String beanName;

    @Getter
    private ApplicationContext applicationContext;


    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}