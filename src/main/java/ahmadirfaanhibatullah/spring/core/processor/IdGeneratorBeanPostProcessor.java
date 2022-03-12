package ahmadirfaanhibatullah.spring.core.processor;

import ahmadirfaanhibatullah.spring.core.aware.IdAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: IdGeneratorBeanPostProcessor.java, v 0.1 2022‐03‐13 05.57 Ahmad Irfaan Hibatullah Exp $$
 */

@Slf4j
@Component
public class IdGeneratorBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("Id Generator Processor");
        if(bean instanceof IdAware) {
            log.info("Set Id Generator Processor for Bean {}", beanName);
            IdAware idAware = (IdAware) bean;
            idAware.setId(UUID.randomUUID().toString());
        }
        return bean;
    }
}