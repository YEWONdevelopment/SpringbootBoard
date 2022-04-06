package com.example.kimEji.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.*;


@Getter
@NoArgsConstructor
@Entity
public class Board {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue
    private Long id;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String name;

    private int age;

    @Column(length = 11, nullable = false)
    private String phone;


    @Builder        //생성자 상단에 선언 시 생성자에 포함된 필드만 빌더에 포함, 생성자나 빌더나 생성 시점에 값을 채워주는 역할
    public Board(String name, int age, String phone){
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public void update(int age, String phone){
        this.age = age;
        this.phone = phone;
    }
}
