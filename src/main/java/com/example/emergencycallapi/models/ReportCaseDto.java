package com.example.emergencycallapi.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import org.aspectj.lang.annotation.After;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportCaseDto {
    @Min(value = 0, message = "Vlera minimale duhet me qene >= 0")
    private long id;
    @NotBlank(message = "Nuk guxon me qene vlere empty ose blank")
    private String description;

    private String caseType;
    private String address;
    private String reporter;
    private LocalDateTime date;
    private boolean active;
}



