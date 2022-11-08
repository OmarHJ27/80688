package mx.uv.c80688;

import static spark.Spark.*;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
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
        post("/",(req,res)->{
            System.out.println("login: "+ req.queryParams("login"));
            System.out.println("password"+ req.queryParams("contraseña"));
            
            JsonObject respuesta = new JsonObject()
            respuesta.addProperty("msj", "bienbenido");

            res.status(200);
            return null;
        });
    }
}
