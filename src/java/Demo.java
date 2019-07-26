package java;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Demo {
    static String greetMany(Map<String, Integer> people) {
        var greetings = new StringBuilder();
        people.forEach((name, repeat) -> {
            greetings.append("Hello ".repeat(repeat) + name);
        });
        return greetings.toString();
    }

    static Map people = new HashMap() {{
        put("Tony", 3);
        put(3, "Tony");
    }};

    enum RAG {Red, Amber, Green}

    public static void main(String[] args) {

        greetMany(people);

//        var foo = "Foo";
//
//        Function<Integer, Integer> doubleIt = (var x) -> x * 2;
//
//        System.out.println(doubleIt.apply(2));
    }

    private String foo(var name) {
        return "Hello " + name;
    }
}
