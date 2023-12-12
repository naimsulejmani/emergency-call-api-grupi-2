package com.example.emergencycallapi.controllers;

import com.example.emergencycallapi.models.ReportCaseDto;
import com.example.emergencycallapi.models.ReportCaseStatusChangeDto;
import com.example.emergencycallapi.services.ReportCaseService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/report-cases")
@CrossOrigin(origins = "*")
public class ReportCaseController {
    private final ReportCaseService reportCaseService;

    public ReportCaseController(ReportCaseService reportCaseService) {
        this.reportCaseService = reportCaseService;
    }

    @GetMapping
    public List<ReportCaseDto> getAllReportCases() {
        return reportCaseService.findAll();
    }

    @GetMapping("/{id}")
    public ReportCaseDto getById(@PathVariable long id) {
        return reportCaseService.findById(id);
    }

    @PostMapping
    public void addReportCase(@Valid @RequestBody ReportCaseDto newCase) {

        reportCaseService.add(newCase);
    }

    @PutMapping("/{id}")
    public void updateReportCase(@PathVariable long id, @RequestBody ReportCaseDto updatedCase) {
        reportCaseService.modify(id, updatedCase);
    }


    @PatchMapping("/{id}")
    public void changeReportStatus(@PathVariable long id, @RequestBody ReportCaseStatusChangeDto updatedCase) {
        reportCaseService.changeStatus(id, updatedCase);
    }

    @DeleteMapping("/{id}")
    public void deleteReportCase(@PathVariable long id) {
        reportCaseService.removeById(id);
    }


}









