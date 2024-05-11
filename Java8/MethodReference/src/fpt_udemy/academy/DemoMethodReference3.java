package fpt_udemy.academy;

public class DemoMethodReference3 {
    public static void main(String[] args) {
        SayHello sayHello = Hello::new;
        sayHello.display("Phan Vinh Khanh");
    }
}
