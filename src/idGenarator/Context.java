package idGenarator;

/**
 * Created by saidbouig on 3/12/2017.
 */
public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public String executeStrategy(){
        return strategy.generateId();
    }
}
