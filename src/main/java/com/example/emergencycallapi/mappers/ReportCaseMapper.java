package com.example.emergencycallapi.mappers;

import com.example.emergencycallapi.entities.ReportCaseEntity;
import com.example.emergencycallapi.models.ReportCaseDto;
import com.example.emergencycallapi.models.ReportCaseListDto;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ReportCaseMapper {
    public ReportCaseEntity toEntity(ReportCaseDto dto) {
        var entity = new ReportCaseEntity();
        entity.setReporter(dto.getReporter());
        entity.setId(dto.getId());
        entity.setDate(dto.getDate());
        entity.setAddress(dto.getAddress());
        entity.setCaseType(dto.getCaseType());
        entity.setDescription(dto.getDescription());
        entity.setCreatedAt(LocalDateTime.now());
        entity.setActive(dto.isActive());
        return entity;
    }

    public ReportCaseDto toDto(ReportCaseEntity entity) {
        var dto = new ReportCaseDto();
        dto.setReporter(entity.getReporter());
        dto.setId(entity.getId());
        dto.setDate(entity.getDate());
        dto.setDescription(entity.getDescription());
        dto.setAddress(entity.getAddress());
        dto.setCaseType(entity.getCaseType());
        dto.setActive(entity.isActive());
        return dto;
    }

    public ReportCaseListDto toListDto(ReportCaseEntity entity) {
        ReportCaseListDto dto = new ReportCaseListDto();
        dto.setReportDate(entity.getDate());
        dto.setCaseType(entity.getCaseType());
        dto.setId(entity.getId());
        return dto;
    }
}







