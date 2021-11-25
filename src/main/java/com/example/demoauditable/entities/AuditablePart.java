package com.example.demoauditable.entities;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Embeddable;
import java.time.Instant;

@Embeddable
public class AuditablePart {

    @CreatedDate //-> doesnt work with @EntityListeners(AuditingEntityListener.class)
    private Instant dateCreated;

    @LastModifiedDate
    private Instant dateUpdated;

    public Instant getDateCreated() {
        return dateCreated;
    }

    public AuditablePart setDateCreated(Instant dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    public Instant getDateUpdated() {
        return dateUpdated;
    }

    public AuditablePart setDateUpdated(Instant dateUpdated) {
        this.dateUpdated = dateUpdated;
        return this;
    }
}
