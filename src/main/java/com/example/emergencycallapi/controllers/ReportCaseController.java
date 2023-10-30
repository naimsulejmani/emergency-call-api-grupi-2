package com.example.emergencycallapi.controllers;

import com.example.emergencycallapi.models.ReportCase;
import com.example.emergencycallapi.services.ReportCaseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/report-cases")
public class ReportCaseController {
    private final ReportCaseService reportCaseService;

    public ReportCaseController(ReportCaseService reportCaseService) {
        this.reportCaseService = reportCaseService;
    }

    @GetMapping
    public List<ReportCase> getAllReportCases() {
        return reportCaseService.findAll();
    }

    @GetMapping("/{id}")
    public ReportCase getById(@PathVariable long id) {
        return reportCaseService.findById(id);
    }

    @PostMapping
    public void addReportCase(@RequestBody ReportCase newCase) {
        reportCaseService.add(newCase);
    }

    @PutMapping("/{id}")
    public void updateReportCase(@PathVariable long id, @RequestBody ReportCase updatedCase) {
        reportCaseService.modify(id, updatedCase);
    }

    @DeleteMapping("/{id}")
    public void deleteReportCase(@PathVariable long id) {
        reportCaseService.removeById(id);
    }


}









