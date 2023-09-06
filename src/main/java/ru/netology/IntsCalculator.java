package ru.netology;

public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        double resultD = target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result;
        int sum = (int) Math.round(resultD);
        return sum;
    }

    @Override
    public int mult(int arg0, int arg1) {
        double resultD = target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result;
        int mult = (int) Math.round(resultD);
        return mult;
    }

    @Override
    public int pow(int a, int b) {
        double resultD = target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result;
        int pow = (int) Math.round(resultD);
        return pow;
    }
}
