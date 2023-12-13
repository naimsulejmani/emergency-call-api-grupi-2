package com.example.emergencycallapi.infrastructure.validatons;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDateTime;

public class LessOrEqualToCurrentDateValidator implements ConstraintValidator<LessOrEqualToCurrentDate, LocalDateTime> {
    @Override
    public void initialize(LessOrEqualToCurrentDate constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(LocalDateTime localDateTime, ConstraintValidatorContext constraintValidatorContext) {
        return localDateTime.isBefore(LocalDateTime.now()) || localDateTime.equals(LocalDateTime.now());
    }
}
