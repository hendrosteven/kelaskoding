package com.kelaskoding.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_members")
@Data
@NoArgsConstructor
public class Member {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number", length = 5, nullable =false, unique = true)
    private String memberNumber;

    @Column(name = "name", length =150, nullable=false)
    private String memberName;

    @Column(name = "email", length=150, nullable =false, unique = true)
    private String memberEmail;

    @Column(name = "password", length=100, nullable = false)
    private String memberPassword;
}
