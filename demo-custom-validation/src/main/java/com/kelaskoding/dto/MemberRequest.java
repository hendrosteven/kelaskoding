package com.kelaskoding.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.kelaskoding.validators.EmailUniqueConstrain;
import com.kelaskoding.validators.NumberUniqueConstrain;
import com.kelaskoding.validators.PasswordEqualConstrain;

import lombok.Data;

@Data
@PasswordEqualConstrain(message = "Retype Password incorrect!")
public class MemberRequest {
    @NotEmpty(message = "Number is required")
    @Size(min = 3, max = 5, message = "Number length must be 3 to 5 characters")
    @Pattern(regexp = "MB[0-9]+", message = "Number must be start with \'MB\'")
    @NumberUniqueConstrain(message = "Number already in use")
    private String memberNumber;

    @NotEmpty(message = "Name is required")
    private String memberName;

    @NotEmpty(message = "Email is required")
    @Email(message = "Invalid email address")
    @EmailUniqueConstrain(message = "Email already in use")
    private String memberEmail;

    @NotEmpty(message = "Password is required")
    private String memberPassword;

    @NotEmpty(message = "RetypePassword is required")
    private String retypeMemberPassword;
}
