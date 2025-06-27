import Operatoren.Operator;

public class Number {
    int num;
    Operator operator;

    public int evaluate(int a) {
        return operator.evaluate(a, num);
    }

    public void neutralize() {
        num = operator.getNeutral();
    }
}
