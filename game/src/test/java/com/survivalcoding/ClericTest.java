package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClericTest {

    @Test
    @DisplayName("MP를 5소비하는 것으로 HP를 최대 HP까지 회복할 수 있어야 한다.")
    void selfAid() {
        // given(준비)
        Cleric cleric = new Cleric();
        cleric.mp = 7;
        cleric.hp = 30;

        // when(실행)
        cleric.selfAid();

        // then(검증)
        assertEquals(Cleric.MAX_HP, cleric.hp);
        assertEquals(2, cleric.mp);
    }

    @Test
    @DisplayName("pray를 통해 자신의 MP를 회복한다.")
    void pray() {
        // given(준비)
        Cleric cleric = new Cleric();
        cleric.mp = 9;

        // when(실행)
        cleric.pray(1);

        // then(검증)
        assertEquals(Cleric.MAX_MP, cleric.mp);
    }
}

