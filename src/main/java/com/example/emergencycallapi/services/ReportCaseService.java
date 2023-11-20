package com.example.emergencycallapi.services;

import com.example.emergencycallapi.models.ReportCaseDto;
import com.example.emergencycallapi.models.ReportCaseStatusChangeDto;

import java.util.List;

public interface ReportCaseService {
    void add(ReportCaseDto rptCase);

    void modify(long id, ReportCaseDto updatedRptCase);

    void removeById(long id);

    ReportCaseDto findById(long id);

    List<ReportCaseDto> findAll();

    void changeStatus(long id, ReportCaseStatusChangeDto statusChangeDto);
}




















