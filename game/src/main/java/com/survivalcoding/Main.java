package com.survivalcoding;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        // 인스턴스 생성
        Hero hero = new Hero();


        hero.hp = 10;
        hero.attack();  // 9
        hero.attack();  // 8


        int a = 10;
        long l = 10L; // literal 리터럴
    }
}