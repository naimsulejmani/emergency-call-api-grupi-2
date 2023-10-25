package com.example.emergencycallapi.models;

import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportCase {
    private long id;
    private String description;
    private String caseType;
    private String address;
    private String reporter;
    private LocalDateTime date;
    private LocalDateTime createdAt = LocalDateTime.now();

}
