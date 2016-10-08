import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practica1 {
    public static void main(String [] args) throws IOException{
        String nombre;
        int edad;
        float salario;
        double altura, nota;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Bienvenido favor introduzca su nombre:");
        nombre= br.readLine();
        System.out.print("Bienvenido favor introduzca su edad:");
        edad =Integer.parseInt(br.readLine());
        System.out.print("Bienvenido favor introduzca su salario:");
        salario = Float.parseFloat(br.readLine());
        System.out.print("Bienvenido favor introduzca su altura:");
        altura = Double.parseDouble(br.readLine());
        System.out.print("Bienvenido favor introduzca su nota:");
        nota = Double.parseDouble(br.readLine());
        System.out.println("hola " + nombre + " tu tienes " + edad + " años " );
        System.out.print("tu sueldo es de " + salario + " , tu mides " +  altura );

        if (edad >= 18){
            System.out.println(" y eres mayor de edad");

        }else {
            System.out.println(" y eres menor de edad");
        }

        if (nota >= 91){
            System.out.print(" Felicidades sacaste una A");
        }else if (nota >=81){
            System.out.println ("No esta mal sacaste una B");
        }else if (nota >=71){
            System.out.println("Pasaste de pansa obtuviste una C");
        }else {
            System.out.println ("salado pescado te quedaste");
        }
    }
}
