package com.example.demoauditable.repo;

import com.example.demoauditable.entities.EntityB;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EntityBRepository extends JpaRepository<EntityB, UUID> {
}
