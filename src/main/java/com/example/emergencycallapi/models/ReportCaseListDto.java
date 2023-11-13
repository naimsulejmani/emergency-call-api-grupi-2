package com.example.emergencycallapi.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReportCaseListDto {
    private long id;
    private String caseType;
    private LocalDateTime reportDate;
}
