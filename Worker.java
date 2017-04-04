package exceptions;

import java.util.Random;

/**
 * Created by d1mys1klapo4ka on 02.04.2017.
 */
public class Worker implements AutoCloseable {

    private Random random = new Random();

    @Override
    public void close() throws Exception {
        if (random.nextBoolean()){
            throw new CheckedExceptions("это проверяемое исключение");
        }
    }

    void work(){
        if (random.nextBoolean()){
            throw new UncheckedExceptions("это не проверяемое исключение");
        }
    }
}
