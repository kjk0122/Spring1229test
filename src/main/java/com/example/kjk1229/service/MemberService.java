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
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
        return memberResponseDto;
    }

    public List<MemberResponseDto> findAllMember() {
        return memberRepository.findAll();
    }
}