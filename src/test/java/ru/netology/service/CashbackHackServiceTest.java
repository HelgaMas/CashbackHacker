package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCountRemainsBeforeMax() {
        int amount = 999;
        int expected = 1;
        assertEquals(expected,service.remain(amount));
    }

    @Test
    public void shouldCountRemainsAfterMin() {
        int amount = 1;
        int expected = 999;
        assertEquals(expected,service.remain(amount));
    }

    @Test
    public void shouldCountRemainsWithoutPurchase() {
        int amount = 0;
        int expected = 1000;
        assertEquals(expected,service.remain(amount));
    }

    @Test
    public void shouldCountRemains() {
        int amount = 200;
        int expected = 800;
        assertEquals(expected,service.remain(amount));
    }
}