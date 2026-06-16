package com.survivalcoding;

public class Wizard {
    private static final int NAME_MIN_LENGTH = 3;
    private static final int DEFAULT_HP = 50;
    private static final int DEFAULT_MP = 100;

    private static final String DEFAULT_WAND_NAME = "기본지팡이";
    private static final double DEFAULT_WAND_POWER = 1.0;

    private static final int HEAL_RECOVER_POINT = 20;
    private static final int HEAL_MP_COST = 10;

    private String name;
    private int hp;
    private int mp = DEFAULT_MP;
    private Wand wand = new Wand(DEFAULT_WAND_NAME, DEFAULT_WAND_POWER);

    public Wizard(String name, int hp, int mp, Wand wand) {
        setName(name);
        setHP(hp);
        setMP(mp);
        setWand(wand);
    }

    public Wizard(String name, int hp, int mp) {
        this(name, hp, mp, new Wand(DEFAULT_WAND_NAME, DEFAULT_WAND_POWER));
    }

    public Wizard(String name, int hp) {
        this(name, hp, DEFAULT_MP, new Wand(DEFAULT_WAND_NAME, DEFAULT_WAND_POWER));
    }

    public Wizard(String name) {
        this(name, DEFAULT_HP, DEFAULT_MP, new Wand(DEFAULT_WAND_NAME, DEFAULT_WAND_POWER));
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("마법사의 이름은 null값일 수 없습니다.");
        }

        if (name.length() < NAME_MIN_LENGTH) {
            throw new IllegalArgumentException("마법사의 이름은 " + NAME_MIN_LENGTH + "문자 이상이어야 합니다.");
        }

        this.name = name;
    }

    public int getHP() {
        return this.hp;
    }

    public void setHP(int hp) {
        this.hp = Math.max(hp, 0);
    }

    public int getMP() {
        return this.mp;
    }

    public void setMP(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("마법사의 MP는 0 이상이어야 합니다.");
        }

        this.mp = mp;
    }

    public Wand getWand() {
        return this.wand;
    }

    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("마법사는 지팡이를 가지고 있어야만 합니다.");
        }

        this.wand = wand;
    }

    public void heal(Hero hero) {
        if (hero == null) {
            throw new IllegalArgumentException("Hero는 null 값이 올 수 없습니다.");
        }

        if (this.mp < HEAL_MP_COST) {
            System.out.println("마나가 부족합니다");
            return;
        }

        hero.hp += HEAL_RECOVER_POINT;
        this.mp -= HEAL_MP_COST;

        System.out.println("힐을 시전했습니다. 대상 HP: " + hero.hp);
    }

    public void fireball(Hero hero) {

    }
}
