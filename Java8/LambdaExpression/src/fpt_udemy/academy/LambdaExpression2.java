package fpt_udemy.academy;

public class LambdaExpression2 {
    public static void main(String[] args) {
        Sayable2 sayable2 = name -> "Hello " + name;
        System.out.println(sayable2.say("Khanh"));
    }
}
