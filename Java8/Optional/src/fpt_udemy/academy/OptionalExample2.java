package fpt_udemy.academy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExample2 {
    public static void main(String[] args) {
        List<String> opt2 = getList().orElse(new ArrayList<>());
        System.out.println(opt2);
        List<String> opt3 = getList().orElseGet(() -> new ArrayList<>());
        System.out.println(opt3);
    }

    static Optional<List<String>> getList() {
        return Optional.ofNullable(null);
    }
}
