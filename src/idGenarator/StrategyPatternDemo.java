package idGenarator;

/**
 * Created by saidbouig on 3/12/2017.
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {

        Context context = new Context(new GeneratorCustom());
        System.out.println(context.executeStrategy());

    }
}
