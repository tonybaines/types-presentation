package java;

import java.time.Clock;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public class Demo {
    static String greetMany(Map<String, Integer> people) {
        var greetings = new StringBuilder();
        people.forEach((name, repeat) -> {
            greetings.append("Hello ".repeat(repeat) + name);
        });
        return greetings.toString();
    }


    enum RAG {Red, Amber, Green}
    class TimeSlot{}
    class Criteria {}
    class Meeting {}

    Optional<TimeSlot> nextFreeMeetingSlot(Criteria criteria) {
        return Optional.empty();
    }

    static abstract class Type<T> {
        public final T value;
        protected Type(final T value) { this.value = value; }

        @Override public String toString() { return value.toString(); }
    }

    static class GivenName extends Type<String> {
        GivenName(String value) { super(value); }
    }

    static class Age extends Type<Integer> {
       Age(Integer value) { super(value); }
    }

    static class Height extends Type<Integer> {
        Height(Integer value) { super(value); }
    }

    static class Name {
        final String familyName, givenName;

        Name(String familyName, String givenName) {
            this.familyName = familyName;
            this.givenName = givenName;
        }
    }

    static class Person {}

    static Person buildPerson(Name name, Age age) { return new Person();}
    static Person buildPerson(Name name, Height height) { return new Person();}

    public static void main(String[] args) {
        Map people = Map.of(
            "Tony", 3,
           3, "Tony"
        );

        var rag = RAG.valueOf("Red");

        switch (rag) {
            case Red: System.out.println("ERROR"); break;
            case Amber: System.out.println("WARNING"); break;
        }

        var tony = new GivenName("Tony");
        var tonyAge = new Age(49);
        System.out.println(tony.value);

        var someTimeLater = CompletableFuture.supplyAsync(() -> {
            Thread.sleep(new Random().nextLong());
            return Clock.systemUTC().instant();
        });



        greetMany(people);

        buildPerson(new Name("Baines", "Tony"), new Height(180));
        buildPerson(new Name("Baines", "Tony"), new Age(49));


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
