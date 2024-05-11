package fpt_udemy.academy;

public class MultiInheritance implements Interface1, Interface2 {

    @Override
    public void doSomeThing() {
        Interface2.super.doSomeThing();
    }
}
