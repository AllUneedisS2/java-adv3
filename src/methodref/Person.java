package methodref;

public class Person {

    private String name;

    public Person() {
        this("Unknown");
    }

    public Person(String name) {
        this.name = name;
    }

    //스태틱
    public static String greeting() {
        return "Hello!";
    }

    //스태틱 + 매개변수
    public static String greetingWithName(String name) {
        return "Hello, " + name + "!";
    }

    //인스턴스
    public String introduce() {
        return "Nice to meet you" + ", I am " + name;
    }

    //인스턴스 + 매개변수
    public String introduceWithName(String name) {
        return "Nice to meet you, " + name;
    }

    public String getName() {
        return name;
    }

}
