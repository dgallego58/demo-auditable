package com.example.demoauditable.entities;

public interface AuditableEntity {

    AuditablePart getAuditablePart();

    void setAuditablePart(AuditablePart auditablePart);

}
