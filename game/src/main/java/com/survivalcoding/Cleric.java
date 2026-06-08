package com.survivalcoding;

public class Cleric {
    public static final int MAX_HP = 50;
    public static final int MAX_MP = 10;

    String name;
    int hp;
    int mp;

    public static void main(String[] args) {
        Cleric myCleric = new Cleric();

        myCleric.hp = 50;
        myCleric.mp = 10;
    }
}