package exceptions;

import com.sun.xml.internal.ws.api.model.CheckedException;

import java.util.Arrays;

/**
 * Created by d1mys1klapo4ka on 02.04.2017.
 */
public class Program {

    public static void main(String[] args) throws Exception {

        Program program = new Program();

        try {
            program.throwable();
        } catch (Exception e) {
            System.out.println("Exception : \n" + e.toString() + '\n');
            System.out.println("Cause of Checked Exception : \n" + e.getCause() + '\n');
            System.out.println("Suppressed Exception : \n" + Arrays.toString(e.getSuppressed()) + '\n');
        }
    }

    void throwable() throws Exception {

        try (Worker worker = new Worker()) {
            worker.work();
        }catch (UncheckedExceptions ue) {
            ue.initCause(new ErrorExceptions("Ошибочка"));
            throw ue;
        }
//        catch (CheckedExceptions  e) {
//            e.initCause(new ErrorExceptions("Ошибка чего - либо"));
//            throw e;
//        }
    }
}
