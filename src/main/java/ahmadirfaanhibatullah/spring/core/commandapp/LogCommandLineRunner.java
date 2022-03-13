package ahmadirfaanhibatullah.spring.core.commandapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: LogCommandLineRunner.java, v 0.1 2022‐03‐13 19.14 Ahmad Irfaan Hibatullah Exp $$
 */
@Slf4j
@Component
public class LogCommandLineRunner implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        log.info("Log Command Line Runner : {}", Arrays.toString(args));
    }
}