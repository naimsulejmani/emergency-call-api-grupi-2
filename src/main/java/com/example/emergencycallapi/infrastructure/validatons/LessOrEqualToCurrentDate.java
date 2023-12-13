package com.example.emergencycallapi.infrastructure.validatons;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;

@Target({FIELD, PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = LessOrEqualToCurrentDateValidator.class)
public @interface LessOrEqualToCurrentDate {
    //error message
    public String message() default "Nuk lejohet data dhe koha te jete me e madhe se data dhe koha aktuale";

    //represents group of constraints
    public Class<?>[] groups() default {};

    //represents additional information about annotation
    public Class<? extends Payload>[] payload() default {};
}
