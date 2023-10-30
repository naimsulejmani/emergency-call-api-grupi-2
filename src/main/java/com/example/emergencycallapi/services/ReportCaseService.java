package com.example.emergencycallapi.services;

import com.example.emergencycallapi.models.ReportCase;

import java.util.List;

public interface ReportCaseService {
    void add(ReportCase rptCase);

    void modify(long id, ReportCase updatedRptCase);

    void removeById(long id);

    ReportCase findById(long id);

    List<ReportCase> findAll();
}


















