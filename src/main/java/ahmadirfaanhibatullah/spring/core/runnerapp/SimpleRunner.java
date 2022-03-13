/**
 * dana.id.
 * Copyright (c) 2017‐2022 All Rights Reserved.
 */
package ahmadirfaanhibatullah.spring.core.runnerapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: SimpleRunner.java, v 0.1 2022‐03‐13 19.21 Ahmad Irfaan Hibatullah Exp $$
 */
@Slf4j
@Component
public class SimpleRunner implements ApplicationRunner {


    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<String> profiles = args.getOptionValues("profiles");
        log.info("Profiles : {}", profiles);
    }
}