package io.soulee.massapp;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.google.common.collect.ImmutableMap;

@SpringBootApplication
@EntityScan("io.soulee.massapp.entity")
@EnableJpaRepositories("io.soulee.massapp.dao")
public class MassappApplication {
    private static final String CONFIG_NAME = "massapp";


    public static void main(String[] args) {
        new SpringApplicationBuilder(MassappApplication.class)
                .properties(ImmutableMap.of("spring.config.name", CONFIG_NAME))
                .build()
                .run(args);
    }

}
