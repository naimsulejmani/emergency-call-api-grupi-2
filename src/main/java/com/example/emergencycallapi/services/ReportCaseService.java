package com.example.emergencycallapi.services;

import com.example.emergencycallapi.models.ReportCaseDto;

import java.util.List;

public interface ReportCaseService {
    void add(ReportCaseDto rptCase);

    void modify(long id, ReportCaseDto updatedRptCase);

    void removeById(long id);

    ReportCaseDto findById(long id);

    List<ReportCaseDto> findAll();
}


















