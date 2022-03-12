/**
 * dana.id.
 * Copyright (c) 2017‐2022 All Rights Reserved.
 */
package ahmadirfaanhibatullah.spring.core.processor;

import ahmadirfaanhibatullah.spring.core.data.Foo;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: FooBeanFactoryPostProcessor.java, v 0.1 2022‐03‐13 06.26 Ahmad Irfaan Hibatullah Exp $$
 */
@Component
public class FooBeanFactoryPostProcessor implements BeanDefinitionRegistryPostProcessor {


    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        GenericBeanDefinition definition = new GenericBeanDefinition();
        definition.setScope("singleton");
        definition.setBeanClass(Foo.class);

        registry.registerBeanDefinition("foo", definition);
    }


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        // nothing
    }
}