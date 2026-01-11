package methodref;

import java.util.function.Supplier;

public class MethodRefEx1 {

    public static void main(String[] args) {
        
        //스태틱
        Supplier<String> staticMethod1 = () -> Person.greeting(); //람다식
        System.out.println(staticMethod1.get());
        Supplier<String> staticMethod2 = Person::greeting; //클래스::스태틱메서드
        System.out.println(staticMethod2.get());

        //인스턴스
        Person person = new Person("Kim");
        Supplier<String> instanceMethod1 = () -> person.introduce(); //람다식
        System.out.println(instanceMethod1.get());
        Supplier<String> instanceMethod2 = person::introduce; //인스턴스::인스턴스메서드
        System.out.println(instanceMethod2.get());

        //생성자
        Supplier<Person> constructor1 = () -> new Person(); //람다식
        System.out.println(constructor1.get());
        Supplier<Person> constructor2 = Person::new; //클래스::new
        System.out.println(constructor2.get());
        

    }

}
