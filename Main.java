public class Main {

    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println("SUM " + calc.sum(2, 2));
        System.out.println("SUM " + calc.sum(10, 22));
        System.out.println("POW " + calc.pow(2, 10));
        System.out.println("MULT " + calc.mult(4, 5));
        System.out.println("DIV " + calc.div(150, 7));
        System.out.println("SUB " + calc.sub(500, 45));
    }
}