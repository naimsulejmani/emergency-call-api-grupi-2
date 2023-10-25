package com.example.emergencycallapi.controllers;

import com.example.emergencycallapi.models.ReportCase;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/api/report-cases")
public class ReportCaseController {
    private static List<ReportCase> cases;

    public ReportCaseController() {
        if (cases == null) {
            cases = new ArrayList<>();
            ReportCase rpt1 = new ReportCase();
            rpt1.setReporter("Edip Mripa");
            rpt1.setCaseType("Aksident me veture");
            rpt1.setId(1);
            rpt1.setDate(LocalDateTime.now());
            rpt1.setDescription("Qysh kesh tu shiku ne telefon, pahiri ndodhi aksidenti, veq kur krisi");
            rpt1.setAddress("Te Cacttus Education - te perpjeteza");
            cases.add(rpt1);
        }
    }

    /*
        1. getAllReportCases
        2. getReportcasesById
        3. getReportCasesQuery
        4. me regjistru nje report case te ri
        5. me modofiku
        6. me fshi
     */
    @GetMapping
    public List<ReportCase> getAllReportCases() {
        return cases;
    }

    @GetMapping("/{id}")
    public ReportCase getById(@PathVariable long id) {
        /*
            SELECT * FROM reportCases WHERE id = {id};
         */
        for (ReportCase rptCase : cases) {
            if (rptCase.getId() == id)
                return rptCase;
        }
        return null;
    }

    @PostMapping
    public void addReportCase(@RequestBody ReportCase newCase) {
        newCase.setId((long) (Math.random() * 1_000_000_000));
        cases.add(newCase);
    }


}









