package mx.uv.c80688;

import static spark.Spark.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hola mundo!" );

        get("/hello", (req, res) -> "Hello World");
        get("/omar", (req, res) -> "Hola Omar ");
    }
}
