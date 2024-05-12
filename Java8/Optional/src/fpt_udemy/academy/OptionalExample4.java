package fpt_udemy.academy;

import java.util.Optional;

public class OptionalExample4 {
    public static void main(String[] args) {
        Optional<String> stringOptional = Optional.empty();
        stringOptional.orElseThrow(() -> new IllegalStateException("Phan Vinh Khanh"));
    }
}
