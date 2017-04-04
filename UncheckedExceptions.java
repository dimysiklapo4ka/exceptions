package exceptions;

/**
 * Created by d1mys1klapo4ka on 02.04.2017.
 */
public class UncheckedExceptions extends RuntimeException{

    public UncheckedExceptions(){

    }

    public UncheckedExceptions(String message){
        super(message);
    }

    protected UncheckedExceptions(String message, Throwable cause,
                               boolean enableSuppression,
                               boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
