package com.example.demoauditable.entities;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@EntityListeners(AuditableListener.class) //this works with embedded
//@EntityListeners(AuditingEntityListener.class) //doesn't work for embedded
public class EntityB implements AuditableEntity{

    @Id
    @GeneratedValue
    private UUID uuid;

    private String randomAtt;

    @Embedded
    private Auditable auditable;

    public UUID getUuid() {
        return uuid;
    }

    public EntityB setUuid(UUID uuid) {
        this.uuid = uuid;
        return this;
    }

    public String getRandomAtt() {
        return randomAtt;
    }

    public EntityB setRandomAtt(String randomAtt) {
        this.randomAtt = randomAtt;
        return this;
    }

    @Override
    public void setAuditable(Auditable auditable) {
        this.auditable = auditable;
    }

    @Override
    public Auditable getAuditable() {
        return auditable;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "uuid = " + uuid + ", " +
                "randomAtt = " + randomAtt + ", " +
                "auditablePart = " + auditable + ")";
    }
}
