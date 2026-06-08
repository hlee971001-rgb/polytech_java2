package com.survivalcoding;

public class Hero {
    String name;
    int hp;

    // 나는 공격하면 hp 가 1 씩 빠진다
    void attack() {
        hp -= 1;
        // sout
        System.out.println("공격했다");
    }
}
