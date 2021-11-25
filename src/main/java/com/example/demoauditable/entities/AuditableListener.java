package com.example.demoauditable.entities;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.Instant;

public class AuditableListener {


    @PrePersist
    public void setCreatedOn(AuditableEntity auditableEntity) {
        Auditable auditable = auditableEntity.getAuditable();
        if (auditable == null) {
            auditable = new Auditable();
            auditableEntity.setAuditable(auditable);
        }
        auditable.setDateCreated(Instant.now());
        auditable.setDateUpdated(Instant.now());
    }

    @PreUpdate
    public void setUpdatedOn(AuditableEntity auditableEntity) {
        auditableEntity.getAuditable().setDateUpdated(Instant.now());
    }
}
