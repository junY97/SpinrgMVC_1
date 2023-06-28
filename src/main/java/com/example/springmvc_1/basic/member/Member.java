package com.example.springmvc_1.basic.member;

import lombok.Getter;
import lombok.Setter;

/**
 * @author junyeong.jo .
 * @since 2023-06-28
 */

@Getter
@Setter
public class Member {
    private Long id;
    private String username;

    public Member() {
    }

    private int age;

    public Member(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
