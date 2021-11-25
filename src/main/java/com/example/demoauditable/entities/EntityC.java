package com.example.demoauditable.entities;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.Instant;
import java.util.UUID;

@Entity
public class EntityC {

    @Id
    @GeneratedValue
    private UUID uuid;

    private String randomAtt;

    @CreationTimestamp
    private Instant createdAt;

    @UpdateTimestamp
    private Instant updatedAt;

    public UUID getUuid() {
        return uuid;
    }

    public EntityC setUuid(UUID uuid) {
        this.uuid = uuid;
        return this;
    }

    public String getRandomAtt() {
        return randomAtt;
    }

    public EntityC setRandomAtt(String randomAtt) {
        this.randomAtt = randomAtt;
        return this;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public EntityC setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public EntityC setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "uuid = " + uuid + ", " +
                "randomAtt = " + randomAtt + ", " +
                "createdAt = " + createdAt + ", " +
                "updatedAt = " + updatedAt + ")";
    }
}
