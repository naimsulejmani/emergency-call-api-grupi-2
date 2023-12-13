package com.example.emergencycallapi.infrastructure.validatons;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDateTime;

public class MinLocalDateTimeValidator implements ConstraintValidator<MinLocalDateTimeValidation, LocalDateTime> {
    private LocalDateTime minDate;

    @Override
    public void initialize(MinLocalDateTimeValidation constraintAnnotation) {
        int year = constraintAnnotation.year();
        int month = constraintAnnotation.month();
        int day = constraintAnnotation.day();
        minDate = LocalDateTime.of(year, month, day, 0, 0, 0);
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(LocalDateTime localDateTime, ConstraintValidatorContext constraintValidatorContext) {
        return localDateTime.isAfter(minDate) || localDateTime.equals(minDate);
    }
}













