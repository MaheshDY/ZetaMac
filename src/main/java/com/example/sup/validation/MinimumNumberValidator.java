package com.example.sup.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MinimumNumberValidator implements ConstraintValidator<ValidMin, Integer> {

  @Override
  public boolean isValid(Integer n, ConstraintValidatorContext constraintValidatorContext) {
    return n != null && n >= 0;
  }
}
