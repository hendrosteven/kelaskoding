package com.kelaskoding.repo;

import com.kelaskoding.entity.Member;

import org.springframework.data.repository.CrudRepository;

public interface MemberRepo extends CrudRepository<Member, Long> {
    
    boolean existsMemberByMemberNumber(String memberNumber);

    boolean existsMemberByMemberEmail(String memberEmail);
}
