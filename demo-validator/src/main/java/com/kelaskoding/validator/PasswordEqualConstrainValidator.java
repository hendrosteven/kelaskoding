package com.kelaskoding.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.kelaskoding.dto.MemberRequest;

public class PasswordEqualConstrainValidator implements ConstraintValidator<PasswordEqualConstrain, Object> {

    @Override
    public boolean isValid(Object data, ConstraintValidatorContext context) {
        MemberRequest memberRequest = (MemberRequest) data;
        return memberRequest.getMemberPassword().equals(memberRequest.getRetypeMemberPassword());
    }
    
}
