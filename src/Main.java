import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        System.out.println(sqrt().apply(98.0));

    }public static UnaryOperator<Double> sqrt(){
        UnaryOperator<Double>unaryOperator=(u)->Math.sqrt(u);
        return unaryOperator;
    }
}