package com.example.emergencycallapi.services.impls;

import com.example.emergencycallapi.mappers.ReportCaseMapper;
import com.example.emergencycallapi.models.ReportCaseDto;
import com.example.emergencycallapi.models.ReportCaseStatusChangeDto;
import com.example.emergencycallapi.repositories.ReportCaseRepository;
import com.example.emergencycallapi.services.ReportCaseService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReportCaseServiceImpl implements ReportCaseService {

    private final ReportCaseRepository repository;
    private final ReportCaseMapper reportCaseMapper;

    public ReportCaseServiceImpl(ReportCaseRepository repository, ReportCaseMapper reportCaseMapper) {
        this.repository = repository;
        this.reportCaseMapper = reportCaseMapper;
    }

    @Override
    public void add(ReportCaseDto rptCase) {
        var entity = reportCaseMapper.toEntity(rptCase); // kthe modelin e dto-se ne model te databazes (entitet)
        repository.save(entity);
    }

    @Override
    public void modify(long id, ReportCaseDto updatedRptCase) {
        var optionalEntity = repository.findById(id);
        if (optionalEntity.isEmpty())
            throw new RuntimeException("Report case not found");

        var entity = optionalEntity.get();
        entity.setCaseType(updatedRptCase.getCaseType());
        entity.setDescription(updatedRptCase.getDescription());
        entity.setReporter(updatedRptCase.getReporter());
        entity.setDate(updatedRptCase.getDate());
        entity.setAddress(updatedRptCase.getAddress());

        repository.save(entity);
    }

    @Override
    public void removeById(long id) {
        repository.deleteById(id);
    }

    @Override
    public ReportCaseDto findById(long id) {
        var entity = repository.findById(id);
        if (entity.isEmpty())
            throw new RuntimeException("Report case not found");
        var dto = reportCaseMapper.toDto(entity.get());
        return dto;
    }

    @Override
    public List<ReportCaseDto> findAll() {
//        var reportCases = repository.findAll();
//        var list = new ArrayList<ReportCaseDto>();
//
//        for (var rpt : reportCases) {
//            list.add(reportCaseMapper.toDto(rpt));
//        }

        return repository.findAll().stream().map(reportCaseMapper::toDto).toList();
    }

    @Override
    public void changeStatus(long id, ReportCaseStatusChangeDto statusChangeDto) {
        var optionalEntity = repository.findById(id);
        if (optionalEntity.isEmpty())
            throw new EntityNotFoundException("Entity not found with id: " + id);
        var entity = optionalEntity.get();
        entity.setActive(statusChangeDto.isActive());
        repository.save(entity);
    }
}















