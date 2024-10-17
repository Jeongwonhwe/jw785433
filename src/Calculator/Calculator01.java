package Calculator;


public class Calculator01 {

  private Abs operation;


    public Calculator01(Abs operation
    ) {
        this.operation = operation;
    }

    public void setOperation (Abs operation) {
        this.operation = operation;
    }

    public double calculate(int firsNumber, int secondNumber) {
        double answer = 0;

      answer = operation.operate(firsNumber, secondNumber);

        return answer;
    }
}