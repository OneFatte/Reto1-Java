import java.util.Scanner;
import java.util.zip.CRC32C;

import Salud.Empleado;
import Salud.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);

        Persona people = new Persona();
        Persona gentle=new Persona("cc", 1015446387, "camilo", "Giraldo", 60, 1.75, 28, "Masculino");
        
        /* Reto 1 y 2 
        people.pedirDatos();
        people.mostrarPerson();
        double IMC=people.calcularIMC(60, 1.75);
        people.mayorEdad();
        
        if(IMC<20){
            System.out.println("El peso esta por debajo de lo ideal "+IMC);
        }
        else if(IMC<=25 && IMC>=20) {
            System.out.println("El peso es ideal "+IMC);
        }
        else{
            System.out.println("Tiene sobre peso "+IMC);
        }
        
        people.setDocumento(1000153932);
        System.out.println("La cedula es "+people.getDocumento());
        System.out.println(gentle.getNombre());
        */

        //Reto 3.............

        Empleado e1=new Empleado("cajero", 9500, 9, "bogota", "cc", 1015446387, "Camilo", "Giraldo");

        e1.calcularHonorarios();

    }
}
