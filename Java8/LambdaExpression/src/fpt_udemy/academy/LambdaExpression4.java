package fpt_udemy.academy;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpression4 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product(1, "Samsung A5", 17000f));
        list.add(new Product(3, "Iphone 6S", 65000f));
        list.add(new Product(2, "Sony Xperia", 25000f));
        list.add(new Product(4, "Nokia Lumia", 15000f));
        list.add(new Product(5, "Redmi4 ", 26000f));
        list.add(new Product(6, "Lenevo Vibe", 19000f));

        list.stream()
                .filter(item -> item.price > 2000)
                .forEach(LambdaExpression4::printInfo);
    }

    private static void printInfo(Product product) {
        System.out.println(product.name + " : " + product.price);
    }
}
