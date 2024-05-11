package fpt_udemy.academy;

public class Hello implements SayHello {
    public Hello(String info) {
        System.out.println(info);
    }

    @Override
    public void display(String info) {
        System.out.println(info);
    }
}
