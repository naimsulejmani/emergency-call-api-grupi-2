package com.example.emergencycallapi.models;

import com.example.emergencycallapi.infrastructure.validatons.LessOrEqualToCurrentDate;
import com.example.emergencycallapi.infrastructure.validatons.MinLocalDateTimeValidation;
import com.example.emergencycallapi.infrastructure.validatons.MonthValidation;
import com.example.emergencycallapi.infrastructure.validatons.groups.OnPost;
import com.example.emergencycallapi.infrastructure.validatons.groups.OnPut;
import jakarta.validation.constraints.*;
import lombok.*;
import org.aspectj.lang.annotation.After;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportCaseDto {
//    @Min(value = 0, message = "Vlera minimale duhet me qene >= 0")
    @Min(value = 0, message = "Vlera minimale duhet me qene >= 0", groups = {OnPost.class, OnPut.class})
       @Min(value = 10, message = "Vlera minimale duhet me qene >= 0",groups = OnPut.class)
    private long id;
    @NotBlank(message = "Nuk guxon me qene vlere empty ose blank")
    private String description;

    @MonthValidation
    private int month;
    private String caseType;
    private String address;
    private String reporter;

    @MinLocalDateTimeValidation(year = 2000, groups = OnPut.class)
    @LessOrEqualToCurrentDate(groups = OnPut.class)
    private LocalDateTime date;

    //    @MinLocalDateTimeValidation(year = 2020)
//    private LocalDateTime registerDate;
    private boolean active;
}



