package com.example.kjk1229.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberResponseDto {

    private Long id;
    private String name;
    private String email;
    private String pw;

    public MemberResponseDto(MemberResponseDto memberResponseDto) {
        this.id= memberResponseDto.getId();
        this.name=memberResponseDto.getName();
        this.email=memberResponseDto.getEmail();
        this.pw=memberResponseDto.getPw();
    }
}