package idGenarator;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

/**
 * Created by said on 05/07/17.
 */
public class GeneratorCustom implements Strategy {


    private int radix = 10;
    private Random random = new SecureRandom();


    @Override
    public String generateId() {

        BigInteger bi = new BigInteger(100, random);
        return bi.toString(radix);

    }
}
