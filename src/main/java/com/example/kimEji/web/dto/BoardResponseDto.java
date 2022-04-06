package com.example.kimEji.web.dto;

import com.example.kimEji.domain.Board;
import lombok.Getter;

@Getter
public class BoardResponseDto {
    private Long id;
    private String name;
    private int age;
    private String phone;

    public BoardResponseDto(Board entity){
        this.id = entity.getId();
        this.name = entity.getName();
        this.age = entity.getAge();
        this.phone = entity.getPhone();
    }

}
