package com.example.emergencycallapi.mappers;

import com.example.emergencycallapi.entities.ReportCaseEntity;
import com.example.emergencycallapi.models.ReportCaseDto;
import com.example.emergencycallapi.models.ReportCaseListDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ReportCaseModelMapper implements Convert<ReportCaseEntity, ReportCaseDto> {

    private final ModelMapper mapper;

    public ReportCaseModelMapper(ModelMapper mapper) {
        this.mapper = mapper;
    }


    @Override
    public ReportCaseEntity toEntity(ReportCaseDto item) {

        return mapper.map(item, ReportCaseEntity.class);
    }

    @Override
    public ReportCaseDto toDto(ReportCaseEntity item) {
        return mapper.map(item, ReportCaseDto.class);
    }

    public ReportCaseListDto toListDto(ReportCaseEntity entity) {
        var dto = mapper.map(entity, ReportCaseListDto.class);
        dto.setReportDate(entity.getDate());
        return dto;
    }
}








