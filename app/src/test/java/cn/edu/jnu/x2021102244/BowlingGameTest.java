package cn.edu.jnu.x2021102244;
import junit.framework.TestCase;

import org.junit.Test;

public class BowlingGameTest extends TestCase {
    @Test
    public void test20Zeros() {
        BowlingGame game = new BowlingGame();
        for (int i=0; i<20; i++)
            game.roll(0);
        assertEquals(0,game.score());
    }
}
