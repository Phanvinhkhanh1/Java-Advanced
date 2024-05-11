package fpt_udemy.academy;

public class DemoMethodReference2 {
    public static void main(String[] args) {
        int a = 100;
        int b = 50;
        MathUtils2 mathUtils2 = new MathUtils2();
        int sum = doAction(a, b, mathUtils2::sum);
        System.out.println(a + " + " + b + " = " + sum);

        int subtract = doAction(a, b, mathUtils2::subtract);
        System.out.println(a + " - " + b + " = " + subtract);
    }

    public static int doAction(int a, int b, ExecuteFunction function) {
        return function.execute(a, b);
    }
}
