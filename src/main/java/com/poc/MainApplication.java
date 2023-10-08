package com.poc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Slf4j
@SpringBootApplication
@EnableCaching
@EnableJpaAuditing
public class MainApplication implements ApplicationRunner {

    // Tuto - https://medium.com/analytics-vidhya/jpa-hibernate-entity-inheritance-1f6aa7ea2eea

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("############################   RUN   ############################");
    }

}
