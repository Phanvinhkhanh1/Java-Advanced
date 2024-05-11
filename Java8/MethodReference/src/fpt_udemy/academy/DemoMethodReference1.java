package fpt_udemy.academy;

public class DemoMethodReference1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int sum = doAction(a, b, MathUtils::sum);
        System.out.println(a + " + " + b + " = " + sum);

        int subtract = doAction(a, b, MathUtils::subtract);
        System.out.println(a + " - " + b + " = " + subtract);
    }

    public static int doAction(int a, int b, ExecuteFunction function) {
        return function.execute(a, b);
    }
}
