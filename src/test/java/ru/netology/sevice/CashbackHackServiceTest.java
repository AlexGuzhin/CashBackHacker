package ru.netology.sevice;

import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService Service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual,expected);
    }

    @Test
    public void testRemainWithCashback() {
        CashbackHackService Service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }
}
