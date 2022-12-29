package com.example.kjk1229.controller;
import com.example.kjk1229.dto.MemberResponseDto;
import com.example.kjk1229.service.MemberService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;
    /**
     * 한 회원의 userId가 주었을때 회원 정보를 조회하는 API
     * @param id
     */
    @GetMapping("/member/{id}")
    public MemberResponseDto findMember(@PathVariable Long id) {
        MemberResponseDto memberResponseDto = memberService.findMember(id);
        return memberResponseDto;
    }
    /**
     * 회원의 전체 목록을 조회하는 API
     */
    @GetMapping("/member")
    public List<MemberResponseDto> findAllMember() {
        return memberService.findAllMember();
    }

}
