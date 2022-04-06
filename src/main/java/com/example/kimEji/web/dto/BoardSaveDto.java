package com.example.kimEji.web.dto;

import com.example.kimEji.domain.Board;
import lombok.Builder;
import lombok.Getter;

@Getter
public class BoardSaveDto {

    private String name;
    private int age;
    private String phone;

    @Builder
    public BoardSaveDto(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public Board toEntity() {
        return Board.builder()
                .name(name)
                .age(age)
                .phone(phone)
                .build();
    }

}
