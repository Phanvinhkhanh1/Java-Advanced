package fpt_udemy.academy;

import java.util.function.Predicate;

public class PredicateExample1 {
    public static void main(String[] args) {
        Predicate<String> stringPredicate = s -> {
            return s.equals("Khanh");
        };
        System.out.println(stringPredicate.test("Khanh"));
        System.out.println(stringPredicate.test("China"));

        Predicate<Integer> integerPredicate = i -> {
            return i > 0;
        };
        System.out.println(integerPredicate.test(1));
        System.out.println(integerPredicate.test(-1));

        System.out.println(stringPredicate.and(s -> s.length() == 10).test("Phan Vinh Khanh"));
        System.out.println(stringPredicate.or(s -> s.length() == 10).test("Phan Vinh Khanh"));
        System.out.println(stringPredicate.negate().test("Phan Vinh Khanh"));
    }
}
