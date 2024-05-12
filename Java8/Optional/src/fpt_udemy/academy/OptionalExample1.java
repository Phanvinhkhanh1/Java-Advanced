package fpt_udemy.academy;

import java.util.Optional;

public class OptionalExample1 {

    public void java8() {
        Student student = getStudent();
        Optional<Student> optionalStudent = Optional.ofNullable(student);
        optionalStudent.ifPresent(val -> System.out.println(val));
    }

    private Student getStudent() {
        Student student = new Student();
        student.name = "Khanh";
        return null;
    }

    public static void main(String[] args) {
        new OptionalExample1().java8();
    }
}
