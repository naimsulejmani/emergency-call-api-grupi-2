package com.example.emergencycallapi.infrastructure.validatons;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class MonthValidator implements ConstraintValidator<MonthValidation, Integer> {
    @Override
    public void initialize(MonthValidation constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        return integer >= 1 && integer <= 12;
    }
}
