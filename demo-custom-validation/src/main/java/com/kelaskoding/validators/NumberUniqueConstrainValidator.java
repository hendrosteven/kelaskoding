package com.kelaskoding.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.kelaskoding.repo.MemberRepo;

import org.springframework.beans.factory.annotation.Autowired;

public class NumberUniqueConstrainValidator implements ConstraintValidator<NumberUniqueConstrain, String>{

    @Autowired
    private MemberRepo repo;
    
    @Override
    public boolean isValid(String memberNumber, ConstraintValidatorContext context) {
        return !repo.existsMemberByMemberNumber(memberNumber);
    }
    
}
