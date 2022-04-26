package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldCountRemainsBeforeMax(){
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountRemainsAfterMin(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1;

        int expected = 999;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountRemainsWithoutPurchase(){
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
    @Test
    void shouldCountRemains(){
        CashbackHackService service = new CashbackHackService();
        int amount = 200;

        int expected = 800;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}