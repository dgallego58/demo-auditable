package com.example.demoauditable;

import com.example.demoauditable.entities.EntityA;
import com.example.demoauditable.entities.EntityB;
import com.example.demoauditable.entities.EntityC;
import com.example.demoauditable.repo.EntityARepository;
import com.example.demoauditable.repo.EntityBRepository;
import com.example.demoauditable.repo.EntityCRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

@SpringBootApplication
@EnableJpaAuditing
public class DemoAuditableApplication {

    private static final Logger log = LoggerFactory.getLogger(DemoAuditableApplication.class);
    @Autowired
    EntityARepository entityARepository;
    @Autowired
    EntityBRepository entityBRepository;
    @Autowired
    EntityCRepository entityCRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoAuditableApplication.class, args);
    }

    @Bean
    ApplicationRunner afterInit() {
        return args -> {
            EntityA entityA = new EntityA().setRandomAtt("Test1");
            entityARepository.save(entityA);

            EntityB entityB = new EntityB().setRandomAtt("test2");
            entityBRepository.save(entityB);

            EntityC entityC = new EntityC().setRandomAtt("Test3");
            entityCRepository.save(entityC);

            List<EntityA> aResult = entityARepository.findAll();
            List<EntityB> bResult = entityBRepository.findAll();
            List<EntityC> cResult = entityCRepository.findAll();
            log.info("EntityA result: {}", aResult);
            log.info("EntityB result: {}", bResult);
            log.info("EntityC result: {}", cResult);

        };
    }
}
