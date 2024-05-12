package fpt_udemy.academy;

import java.util.Optional;

public class OptionalExample3 {
    public static void main(String[] args) {
        Optional<String> optionalOf = Optional.of("welcome to gpcoder.com");
        Optional<String> optionalEmpty = Optional.empty();

        System.out.println(optionalOf.map(String::toLowerCase));
        System.out.println(optionalEmpty.map(String::toLowerCase));

        Optional<Optional<String>> multiOptional = Optional.of(Optional.of("Khanh"));
        System.out.println(multiOptional.flatMap(val -> val.map(String::toLowerCase)));
    }
}
