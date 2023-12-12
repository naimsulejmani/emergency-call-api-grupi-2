package com.example.emergencycallapi.mappers;

import com.example.emergencycallapi.entities.ReportCaseEntity;
import com.example.emergencycallapi.models.ReportCaseDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ReportCaseMapStructMapper extends Convert<ReportCaseEntity, ReportCaseDto> {

    ReportCaseMapStructMapper MAPPER = Mappers.getMapper(ReportCaseMapStructMapper.class);
}
