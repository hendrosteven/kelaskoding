package com.kelaskoding.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.kelaskoding.repo.MemberRepo;

import org.springframework.beans.factory.annotation.Autowired;

public class EmailUniqueConstrainValidator implements ConstraintValidator<EmailUniqueConstrain, String>{

    @Autowired
    private MemberRepo repo;

    @Override
    public boolean isValid(String memberEmail, ConstraintValidatorContext context) {
    
        return !repo.existsMemberByMemberEmail(memberEmail);
    }
    
}
