package com.survivalcoding;

import java.util.Random;

public class Cleric {
    public static final int MAX_HP = 50;
    public static final int MAX_MP = 10;

    String name;
    int hp;
    int mp;

    void selfAid() {
        if (mp >= 5) {
            mp -= 5;
            hp = MAX_HP;
        }
    }

    int pray(int sec) {
        Random random = new Random();
        int recovery = sec + random.nextInt(3);

        int actual = Math.min(recovery, MAX_MP - mp);

        mp += actual;
        return actual;
    }

    public static void main(String[] args) {
        Cleric myCleric = new Cleric();

        myCleric.hp = 50;
        myCleric.mp = 10;
    }
}