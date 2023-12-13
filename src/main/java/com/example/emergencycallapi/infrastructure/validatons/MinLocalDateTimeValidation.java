package com.example.emergencycallapi.infrastructure.validatons;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;

@Target({FIELD, PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = MinLocalDateTimeValidator.class)

public @interface MinLocalDateTimeValidation {

    public int year() default 1900;

    public int month() default 1;

    public int day() default 1;

    //error message
    public String message() default "Nuk lejohet data me e vjeter se e specifikuara";

    //represents group of constraints
    public Class<?>[] groups() default {};

    //represents additional information about annotation
    public Class<? extends Payload>[] payload() default {};
}
