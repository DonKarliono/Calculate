package bl;

public interface Operation {
    double minus(double x, double y);

    double plus(double x, double y);

    double multiplication(double x, double y);

    double division(double x, double y) throws Exception;
    long faktorial(int x);
};
