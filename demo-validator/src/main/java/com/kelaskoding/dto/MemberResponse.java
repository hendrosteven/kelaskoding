package com.kelaskoding.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberResponse {

    private Long id;
    
    private String memberNumber;
    
    private String memberName;

    private String memberEmail;

}
