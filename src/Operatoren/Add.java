package Operatoren;

public class Add implements Operator {

    final int neutral = 0;

    public int evaluate(int a, int b) {
        return a + b;
    }

    public int getNeutral() {
        return neutral;
    }
}
