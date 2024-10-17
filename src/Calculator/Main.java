package Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator01 calculator01 = new Calculator01(new Add());
        System.out.println(calculator01.calculate(10,20));

        calculator01.setOperation(new Sub());
        System.out.println(calculator01.calculate(10,20));

        calculator01.setOperation(new Mul());
        System.out.println(calculator01.calculate(10,20));

        calculator01.setOperation(new Div());
        System.out.println(calculator01.calculate(10,20));
    }
}
