package ahmadirfaanhibatullah.spring.core.processor;

import ahmadirfaanhibatullah.spring.core.aware.IdAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: PrefixIdGeneratorBeanPostProcessor.java, v 0.1 2022‐03‐13 06.10 Ahmad Irfaan Hibatullah Exp $$
 */

@Slf4j
@Component
public class PrefixIdGeneratorBeanPostProcessor implements BeanPostProcessor, Ordered  {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("Prefix Id Generator Processor");
        if(bean instanceof IdAware) {
            log.info("{refoxSet Id Generator Processor for Bean {}", beanName);
            IdAware idAware = (IdAware) bean;
            idAware.setId("IRF-" + idAware.getId());
        }
        return bean;
    }


    @Override
    public int getOrder() {
        return 1;
    }
}