package com.example.emergencycallapi.repositories;

import com.example.emergencycallapi.entities.ReportCaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReportCaseRepository extends JpaRepository<ReportCaseEntity, Long> {

    //SELECT * FROM reportcases where reporter = :reporter ORDER BY date
    public List<ReportCaseEntity> findAllByReporterOrderByDate(String reporter);

    public List<ReportCaseEntity> findAllByActiveOrAddress(boolean active, String address);

    @Query(value = "SELECT * FROM report_cases WHERE address=:address or active = :active order by date limit 10", nativeQuery = true)
    public List<ReportCaseEntity> findX(String address, boolean active);


    @Query("SELECT r FROM ReportCaseEntity r WHERE r.address = ?1 AND r.active=?2 ORDER BY r.date LIMIT 10")
    public List<ReportCaseEntity> findY(String address, boolean active);
}













