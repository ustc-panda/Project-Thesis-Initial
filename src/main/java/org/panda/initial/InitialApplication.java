package org.panda.initial;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.panda.initial.mapper")
public class InitialApplication {

    public static void main(String[] args) {
        SpringApplication.run(InitialApplication.class, args);
    }

}
