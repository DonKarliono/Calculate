package bl;

public class Calculation implements Operation {
    @Override
    public double minus(double x, double y) {
        return x - y;
    }

    @Override
    public double plus(double x, double y) {
        return x + y;
    }

    @Override
    public double multiplication(double x, double y) {
        return x * y;
    }

    @Override
    public double division(double x, double y) throws Exception {
        if (y == 0) {
            throw new Exception("Division by zero");
        } else return x / y;
    }

    @Override
    public long faktorial(int x) {
        return 0;
    }
}
