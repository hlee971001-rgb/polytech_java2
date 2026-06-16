package com.survivalcoding;

public class PoisonSlime {
    private String suffix;
    private int poisonCount = 5;

    public PoisonSlime(String suffix) {
        this.suffix = suffix;
    }

    public void attack(Hero hero) {
        System.out.println("슬라임" + suffix + "의 공격!");
        hero.hp -= 10;
        System.out.println("10포인트 데미지");

        if (poisonCount > 0) {
            System.out.println("추가로, 독 포자를 살포했다!");

            int poisonDamage = hero.hp / 5;
            hero.hp -= poisonDamage;

            System.out.println(poisonDamage + "포인트 데미지");

            poisonCount--;
        }
    }
}
