/**
 * Created by said on 04/07/17.
 */


import java.util.UUID;

public class GenerateUUID {

    public static final void main(String... aArgs){
        //generate random UUIDs

        do{
            log("UUID: "+UUID.randomUUID());
        }while(true);
        /*
        UUID idOne = UUID.randomUUID();
        UUID idTwo = UUID.randomUUID();
        log("UUID One: " + idOne);
        log("UUID Two: " + idTwo);
        */
    }

    private static void log(Object aObject){
        System.out.println( String.valueOf(aObject) );
    }
}
