package com.example.kjk1229.dto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class MemberResponseDto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String pw;

    public MemberResponseDto(MemberResponseDto memberResponseDto) {
        this.id= memberResponseDto.getId();
        this.name=memberResponseDto.getName();
        this.email=memberResponseDto.getEmail();
        this.pw=memberResponseDto.getPw();
    }
}