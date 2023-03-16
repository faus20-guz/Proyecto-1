package proyectofausto;

/**
 *
 * @author 50242
 * 
 */
import registroDatos.Usuarios;
import frontEnd.authForm;
import java.util.ArrayList;
import javax.swing.JFrame;


public class Main {

public static ArrayList<Usuarios> usuarios = new ArrayList<>();
public static JFrame frame;

    public static void main(String[] args) {
        // TODO code application logic here
        Usuarios admin = new Usuarios("ipc1_202106364@ipc1delivery.com", "Fausto", "Guzman", "3043224070114", "20/01/03", "masculino", "guatemalteco", "Faus", 123456789, "202106364");
        authForm nuevoProceso = new authForm();
        nuevoProceso.setVisible(true);
       
    }
    
        
     public static boolean verificarExistencia(String correo){

        for (Usuarios es: usuarios) {
            if(es.getCorreo().equals(correo)){
                return true;
            }
        }
        return false;
    }
}
