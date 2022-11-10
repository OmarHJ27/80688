package mx.uv.80688;

import static spark.Spark.*;
import java.util.HashMap;
import java.util.Map;
import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        port(80);
        System.out.println( "Hello World!" );
        Usuario u1 = new Usuario("1","Pedro","1234");
    }
}
