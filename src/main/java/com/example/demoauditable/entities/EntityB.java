package com.example.demoauditable.entities;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
//@EntityListeners(AuditableListener.class)
@EntityListeners(AuditingEntityListener.class) //doesn't work for embedded
public class EntityB implements AuditableEntity{

    @Id
    @GeneratedValue
    private UUID uuid;

    private String randomAtt;

    @Embedded
    private AuditablePart auditablePart;

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
    public void setAuditablePart(AuditablePart auditablePart) {
        this.auditablePart = auditablePart;
    }

    @Override
    public AuditablePart getAuditablePart() {
        return auditablePart;
    }
}
