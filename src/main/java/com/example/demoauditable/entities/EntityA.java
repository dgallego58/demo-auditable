package com.example.demoauditable.entities;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.Instant;
import java.util.UUID;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class EntityA {

    @Id
    @GeneratedValue
    private UUID uuid;

    private String randomAtt;

    @CreatedDate
    private Instant dateCreated;

    @LastModifiedDate
    private Instant dateUpdated;

    public UUID getUuid() {
        return uuid;
    }

    public EntityA setUuid(UUID uuid) {
        this.uuid = uuid;
        return this;
    }

    public String getRandomAtt() {
        return randomAtt;
    }

    public EntityA setRandomAtt(String randomAtt) {
        this.randomAtt = randomAtt;
        return this;
    }

    public Instant getDateCreated() {
        return dateCreated;
    }

    public EntityA setDateCreated(Instant dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    public Instant getDateUpdated() {
        return dateUpdated;
    }

    public EntityA setDateUpdated(Instant dateUpdated) {
        this.dateUpdated = dateUpdated;
        return this;
    }
}
