package com.example.emergencycallapi.repositories;

import com.example.emergencycallapi.entities.ReportCaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportCaseRepository extends JpaRepository<ReportCaseEntity, Long> {
}
