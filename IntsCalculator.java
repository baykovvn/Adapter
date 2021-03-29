public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        int sum = (int) target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
        return sum;
    }

    @Override
    public float div(int a, int b) {
        float div = (float) target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.DIV)
                .result();
        return div;
    }

    @Override
    public int sub(int a, int b) {
        int sub = (int) target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.SUB)
                .result();
        return sub;
    }

    @Override
    public int mult(int arg0, int arg1) {
        int mult = (int) target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
        return mult;
    }

    @Override
    public int pow(int a, int b) {
        int pow = (int) target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
        return pow;
    }
}
