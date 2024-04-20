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
}
