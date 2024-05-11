package fpt_udemy.academy;

public class LambdaExpression1 {
    public static void main(String[] args) {
        Sayable1 s = () -> "Phan Vinh Khanh";
        System.out.println(s.say());
    }
}
