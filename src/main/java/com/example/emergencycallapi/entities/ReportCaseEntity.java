package com.example.emergencycallapi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "report_cases")
public class ReportCaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String description;
    private String caseType;
    private String address;
    private String reporter;
    @Column(nullable = true)
    private boolean active;
    private LocalDateTime date;
    private LocalDateTime createdAt = LocalDateTime.now();

}
