package com.kelaskoding.dto;

import lombok.Data;

@Data
public class MemberResponse {
    private Long id;
    private String memberNumber;
    private String memberName;
    private String memberEmail;
}
