package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCountRemainsBeforeMax() {
        int amount = 999;
        int expected = 1;
        assertEquals(service.remain(amount), expected);
    }

    @Test
    public void shouldCountRemainsAfterMin() {
        int amount = 1;
        int expected = 999;
        assertEquals(service.remain(amount), expected);
    }

    @Test
    public void shouldCountRemainsWithoutPurchase() {
        int amount = 0;
        int expected = 1000;
        assertEquals(service.remain(amount), expected);
    }

    @Test
    public void shouldCountRemains() {
        int amount = 200;
        int expected = 800;
        assertEquals(service.remain(amount), expected);
    }
}