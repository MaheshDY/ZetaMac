package com.example.sup.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DivMaxValidator implements ConstraintValidator<ValidDivMax, Integer> {

  @Override
  public boolean isValid(Integer n, ConstraintValidatorContext constraintValidatorContext) {
    return n != 0;
  }
}
