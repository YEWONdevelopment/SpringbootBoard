package com.example.kimEji.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BoardUpdateDto {

    private int age;
    private String phone;

    @Builder
    public BoardUpdateDto(int age, String phone){
        this.age = age;
        this.phone = phone;
    }

}
