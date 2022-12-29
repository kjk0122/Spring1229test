package com.example.kjk1229.service;

import com.example.kjk1229.dto.MemberResponseDto;
import com.example.kjk1229.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberResponseDto findMember(Long id) {
        MemberResponseDto memberResponseDto = memberRepository.findById(id).orElseThrow(
                () -> new NullPointerException ("회원 상세 조회 실패")
        );
        return memberResponseDto;
    }

    public List<MemberResponseDto> findAllMember() {
        return memberRepository.findAll();
    }
}