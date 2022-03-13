package ahmadirfaanhibatullah.spring.core.application;

import ahmadirfaanhibatullah.spring.core.data.Foo;
import ahmadirfaanhibatullah.spring.core.listener.AppStartingListener;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: FooApplication.java, v 0.1 2022‐03‐13 18.00 Ahmad Irfaan Hibatullah Exp $$
 */

@SpringBootApplication
public class FooApplication {

//    public static void main(String[] args) {
//        ConfigurableApplicationContext context = SpringApplication.run(FooApplication.class, args);
//
//        Foo foo = context.getBean(Foo.class);
//        System.out.println(foo);
//    }

//    public static void main(String[] args) {
//        SpringApplication application = new SpringApplication(FooApplication.class);
//        application.setBannerMode(Banner.Mode.OFF);
//        List<AppStartingListener> listeners = Arrays.asList(new AppStartingListener());
//        application.setListeners(listeners);
//
//        ConfigurableApplicationContext context = application.run(args);
//
//        Foo foo = context.getBean(Foo.class);
//        System.out.println(foo);
//    }

    @Bean
    public Foo foo() {
        return new Foo();
    }
}