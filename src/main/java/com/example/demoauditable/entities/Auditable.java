package com.example.demoauditable.entities;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Embeddable;
import java.time.Instant;

@Embeddable
public class Auditable {

    @CreatedDate //-> doesnt work with @EntityListeners(AuditingEntityListener.class)
    private Instant dateCreated;

    @LastModifiedDate
    private Instant dateUpdated;

    public Instant getDateCreated() {
        return dateCreated;
    }

    public Auditable setDateCreated(Instant dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    public Instant getDateUpdated() {
        return dateUpdated;
    }

    public Auditable setDateUpdated(Instant dateUpdated) {
        this.dateUpdated = dateUpdated;
        return this;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "dateCreated = " + dateCreated + ", " +
                "dateUpdated = " + dateUpdated + ")";
    }
}
