package cn.edu.jnu.x2021102244;
import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest extends TestCase {

    private BowlingGame game;

    @Before
    public void setUp() throws Exception {
        game = new BowlingGame();
    }

    @Test
    public void test20Zeros() {
        for (int i=0; i<20; i++)
            game.roll(0);
        assertEquals(0, game.score());
    }

    @Test
    public void test20Ones() {
        for (int i=0; i<20; i++)
            game.roll(1);
        assertEquals(20, game.score());
    }

    @Test
    public void test2019And16Zeros() {
        game.roll(2);
        game.roll(0);
        game.roll(1);
        game.roll(9);
        for (int i=0; i<16; i++)
            game.roll(0);
        assertEquals(12, game.score());
    }

    @Test
    public void test101011And14Zeros() {
        game.roll(10);
        game.roll(10);
        game.roll(1);
        game.roll(1);
        for (int i=0; i<14; i++)
            game.roll(0);
        assertEquals(35, game.score());
    }

    @Test
    public void test12Tens() {
        for (int i=0; i<12; i++)
            game.roll(10);
        assertEquals(300, game.score());
    }
}
