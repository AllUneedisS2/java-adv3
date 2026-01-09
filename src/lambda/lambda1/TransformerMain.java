package lambda.lambda1;

public class TransformerMain {

    public static void main(String[] args) {
        
        MyTransformer toUpper = s -> s.toUpperCase();
        MyTransformer addDeco = s -> "**" + s + "**";
        MyTransformer composeFunc = compose(toUpper, addDeco);

        System.out.println(composeFunc.transform("Lambda"));

    }

    public static MyTransformer compose(MyTransformer f1, MyTransformer f2) {
        return new MyTransformer() {
            @Override
            public String transform(String s) {
                return f2.transform(f1.transform(s));
            }
        };
    }

}
