public class BasicCalculator implements Calculator{
    @Override
    public double add(double operand1, double operand2) {
        return operand1+operand2;
    }

    @Override
    public double subtract(double operand1, double operand2) {
        return operand1-operand2;
    }

    @Override
    public double multiply(double operand1, double operand2) {
        return operand1 * operand2;
    }

    @Override
    public double divide(double dividend, double divisor) throws ArithmeticException {
        if (divisor != 0) {
            return dividend / divisor;
        }else throw new ArithmeticException("Cannot divide by zero");

    }
}
