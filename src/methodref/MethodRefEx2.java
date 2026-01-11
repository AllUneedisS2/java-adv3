package methodref;

import java.util.function.Function;

public class MethodRefEx2 {

    public static void main(String[] args) {
        
        //스태틱
        Function<String, String> staticMethod1 = name -> Person.greetingWithName(name); //람다식
        System.out.println(staticMethod1.apply("Kim"));
        Function<String, String> staticMethod2 = Person::greetingWithName; //클래스::스태틱메서드
        System.out.println(staticMethod2.apply("Kim"));

        //인스턴스
        Person person = new Person("Kim");
        Function<String, String> instanceMethod1 = name -> person.introduceWithName(name);
        System.out.println(instanceMethod1.apply("Lee"));
        Function<String, String> instanceMethod2 = person::introduceWithName;
        System.out.println(instanceMethod2.apply("Lee"));
        
        //생성자
        Function<String, Person> constructor1 = name -> new Person(name); //람다식
        System.out.println(constructor1.apply("Park"));
        Function<String, Person> constructor2 = Person::new; //클래스::new
        System.out.println(constructor2.apply("Park"));

    }

}
