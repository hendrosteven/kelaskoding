package com.kelaskoding.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.kelaskoding.dto.MemberRequest;
import com.kelaskoding.dto.MemberResponse;
import com.kelaskoding.dto.ResponseData;
import com.kelaskoding.entity.Member;
import com.kelaskoding.repo.MemberRepo;
import com.kelaskoding.utility.ErrorParsingUtility;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/members")
public class MemberController {

    @Autowired
    private MemberRepo repo;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    public ResponseEntity<ResponseData<?>> createOne(@Valid @RequestBody MemberRequest memberRequest, Errors errors) {
        ResponseData<MemberResponse> response = new ResponseData<>();

        if (errors.hasErrors()) {
            response.setStatus(false);
            response.setMessages(ErrorParsingUtility.parse(errors));
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        }
        try {
            Member member = modelMapper.map(memberRequest, Member.class);
            member = repo.save(member);

            response.setStatus(true);
            response.getMessages().add("Member saved!");
            response.setPayload(modelMapper.map(member, MemberResponse.class));
            return ResponseEntity.ok(response);
        } catch (Exception ex) {
            response.setStatus(false);
            response.getMessages().add(ex.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }

    }

    @GetMapping
    public ResponseEntity<ResponseData<List<MemberResponse>>> findAll() {
        ResponseData<List<MemberResponse>> response = new ResponseData<>();
        List<MemberResponse> listMember = new ArrayList<>();
        repo.findAll().forEach(member -> {
            listMember.add(modelMapper.map(member, MemberResponse.class));
        });
        response.setStatus(true);
        response.setPayload(listMember);
        return ResponseEntity.ok(response);
    }
}
