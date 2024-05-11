package fpt_udemy.academy;

public class LambdaExpression3 {
    public static void main(String[] args) {
        Addable3 addable3 = (a, b) -> a + b;
        System.out.println(addable3.add(5, 6));
    }
}
