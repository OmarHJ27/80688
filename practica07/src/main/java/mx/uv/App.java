package mx.uv;

import static spark.Spark.*;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App {

    public static Gson gson = new Gson();
    private static Map<String, Usuario> usuarios = new HashMap<>();
    // private static Conexion c;

    public static void main(String[] args) {
        // intentar conectar a la BD
        // c = new Conexion();
        // c.getConnection();

        port(80);
        options("/*", (request, response) -> {
                String accessControlRequestHeaders = request.headers("Access-Control-Request-Headers");
                System.out.println(accessControlRequestHeaders);
                if (accessControlRequestHeaders != null) {
                    response.header("Access-Control-Allow-Headers", accessControlRequestHeaders);
                }
                String accessControlRequestMethod = request.headers("Access-Control-Request-Method");
                System.out.println(accessControlRequestMethod); 
                if (accessControlRequestMethod != null) {
                    response.header("Access-Control-Allow-Methods", accessControlRequestMethod);
                }
                return "OK";
            });
            
        before((req, res)-> res.header("Access-Control-Allow-Origin", "*"));
        System.out.println("Hello World!");
        Usuario u1 = new Usuario("1", "Pedro", "1234");
        Usuario u2 = new Usuario("2", "Pablo", "7890");

        usuarios.put(u1.getId(), u1);
        usuarios.put(u2.getId(), u2);

        before((req, res)-> res.type("application/json"));
        // devolver un usuario
        // get("/", (req, res) -> gson.toJson(u1) ); 
        // devolver lista de usuarios
        // get("/", (req, res) -> gson.toJson(usuarios) );
        get("/usuarios", (req, res) -> gson.toJson(DAO.dameUsuarios()) );
        // get("/", (req, res) -> u1.getNombre() );

        post("/", (req,res)->{
            String datosCliente = req.body();
            Usuario u = gson.fromJson(datosCliente, Usuario.class);
            // usuarios.put(u.getId(), u);
            // return "listo se ingreso el usuario "+u.getId();
            return DAO.crearUsuario(u);
        });

        post("/edita",(req,res)->{
            String datosCliente = req.body();
            Usuario u = gson.fromJson(datosCliente, Usuario.class);

            return DAO.editaUsuario(u);
        });

        post("/elimina",(req,res)->{
            String datosCliente = req.body();
            Usuario u = gson.fromJson(datosCliente, Usuario.class);

            return DAO.eliminarUsuario(u);
        });

    }
}
