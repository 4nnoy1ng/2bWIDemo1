package at.dan.oo.projects.calculator;

public class Main {
    public static void main(String[] args) {
        BaseCalculater bc = new BaseCalculater();
        System.out.println(bc.add(4,4));
        System.out.println(bc.subtract(4,4));
        System.out.println(bc.multiply(4,4));
        System.out.println(bc.divide(4,4));

        SinusCalculator sc = new SinusCalculator();
        System.out.println(sc.sqrt(49));
        System.out.println(sc.sin(4));
        System.out.println(sc.cos(4));
    }
}
