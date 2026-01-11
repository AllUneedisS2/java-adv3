package methodref;

import java.util.function.Function;

public class MethodRefEx3 {

    public static void main(String[] args) {
        
        Person person1 = new Person("Choi");
        Person person2 = new Person("Jung");
        Person person3 = new Person("Han");

        //람다식
        Function<Person, String> f1 = (Person person) -> person.introduce();
        System.out.println(f1.apply(person1));
        System.out.println(f1.apply(person2));
        System.out.println(f1.apply(person3));

        //메서드 참조
        Function<Person, String> f2 = Person::introduce;
        System.out.println(f2.apply(person1));
        System.out.println(f2.apply(person2));
        System.out.println(f2.apply(person3));

    }

}
