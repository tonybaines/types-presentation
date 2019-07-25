package java;

import java.util.function.Function;

public class Demo {
    public static void main(String[] args) {
        var foo = "Foo";

        Function<Integer, Integer> doubleIt = (var x) -> x * 2;

        System.out.println(doubleIt.apply(2));
    }

    private String foo(var name) {
        return "Hello " + name;
    }
}
