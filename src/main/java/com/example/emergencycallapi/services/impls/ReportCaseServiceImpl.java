package com.example.emergencycallapi.services.impls;

import com.example.emergencycallapi.models.ReportCase;
import com.example.emergencycallapi.services.ReportCaseService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReportCaseServiceImpl implements ReportCaseService {
    private static List<ReportCase> cases;

    public ReportCaseServiceImpl() {
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

            ReportCase rpt2 = new ReportCase();
            rpt2.setReporter("Erblini");
            rpt2.setCaseType("Spom bon CORS");
            rpt2.setId(2);
            rpt2.setDate(LocalDateTime.now());
            rpt2.setDescription("Spom lejon me thirr prej frontend ne springboot");
            rpt2.setAddress("Klasa e kuqe");
            cases.add(rpt2);

        }
    }

    @Override
    public void add(ReportCase rptCase) {
        rptCase.setId((long) (Math.random() * 1_000_000_000));
        cases.add(rptCase);
    }

    @Override
    public void modify(long id, ReportCase updatedRptCase) {
        ReportCase reportCase = null;

        for (ReportCase rpt : cases) {
            if (rpt.getId() == id) {
                reportCase = rpt;
                break;
            }
        }

        if (reportCase == null) {
            throw new RuntimeException("Report case with id not found! -> " + id);
        }

        reportCase.setDescription(updatedRptCase.getDescription());
        reportCase.setCaseType(updatedRptCase.getCaseType());
        reportCase.setDate(updatedRptCase.getDate());
        reportCase.setAddress(updatedRptCase.getAddress());
        reportCase.setReporter(updatedRptCase.getReporter());
    }

    @Override
    public void removeById(long id) {
        cases.removeIf(rpt -> rpt.getId() == id);
    }

    @Override
    public ReportCase findById(long id) {
        /*
            SELECT * FROM reportCases WHERE id = {id};
         */
        for (ReportCase rptCase : cases) {
            if (rptCase.getId() == id)
                return rptCase;
        }
        return null;
    }

    @Override
    public List<ReportCase> findAll() {
        return cases;
    }
}
