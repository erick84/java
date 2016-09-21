import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class holamundo {

    public static void main (String [] args) throws IOException {
       String nombre, edad;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("hola mundo.");
        System.out.println("como te llamas");
        nombre = br.readLine();
        System.out.println("hola " +nombre);
        System.out.println("cual es tu edad");
        edad = br.readLine();
        System.out.println ("tu edad es "+edad);




    }
}
