package com.example.demoauditable.repo;

import com.example.demoauditable.entities.EntityA;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EntityARepository extends JpaRepository<EntityA, UUID> {
}
