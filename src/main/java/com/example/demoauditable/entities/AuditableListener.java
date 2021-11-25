package com.example.demoauditable.entities;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.Instant;

public class AuditableListener {


    @PrePersist
    public void setCreatedOn(AuditableEntity auditableEntity) {
        AuditablePart auditablePart = auditableEntity.getAuditablePart();
        if (auditablePart == null) {
            auditablePart = new AuditablePart();
            auditableEntity.setAuditablePart(auditablePart);
        }
        auditablePart.setDateCreated(Instant.now());
        auditablePart.setDateUpdated(Instant.now());
    }

    @PreUpdate
    public void setUpdatedOn(AuditableEntity auditableEntity) {
        auditableEntity.getAuditablePart().setDateUpdated(Instant.now());
    }
}
