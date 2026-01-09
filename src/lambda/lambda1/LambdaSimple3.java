package lambda.lambda1;

import lambda.MyFunction;

public class LambdaSimple3 {

    public static void main(String[] args) {
        MyFunction funtion1 = (a, b) -> a + b;
        System.out.println(funtion1.apply(1, 2));
    }

}
