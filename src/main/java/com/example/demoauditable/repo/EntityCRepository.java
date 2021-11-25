package com.example.demoauditable.repo;

import com.example.demoauditable.entities.EntityC;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EntityCRepository extends JpaRepository<EntityC, UUID> {
}
