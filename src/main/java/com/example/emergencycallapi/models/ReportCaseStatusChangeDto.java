package com.example.emergencycallapi.models;

import lombok.Data;

@Data
public class ReportCaseStatusChangeDto {

    private long id;
    private boolean active;
}
