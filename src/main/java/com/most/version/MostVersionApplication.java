package com.most.version;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 武海升
 * @date 2018/9/12 16:08
 */
@SpringBootApplication
@Slf4j
public class MostVersionApplication {

    public static void main(String[] args) {
        SpringApplication.run(MostVersionApplication.class, args);
        log.info("Application Spring Boot Most Version  Start-Up is success!");
    }

}
