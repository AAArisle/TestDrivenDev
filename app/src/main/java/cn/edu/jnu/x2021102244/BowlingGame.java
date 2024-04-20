package cn.edu.jnu.x2021102244;

public class BowlingGame {
    private int score = 0;

    public void roll(int pins) {
        score += pins;
    }

    public int score() {
        return score;
    }
}
