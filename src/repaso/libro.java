package repaso;
import java.util.Scanner;

public class libro {
    Scanner leer=new Scanner(System.in);
    
    private int idLibro;
    public String nombreLibro;
    private String autorLibro;
    private String categoriaLibro;
    private String editorialLibro;


    public void registrarLibro(){

        System.out.println("Ingrese el id del libro");
        idLibro=leer.nextInt();

        leer.nextLine();


        System.out.println("Ingrese el nombre del libro");
        nombreLibro=leer.nextLine();

        System.out.println("Ingrese el autor del libro");
        autorLibro=leer.nextLine();

        System.out.println("Ingrese la categoria del libro");
        categoriaLibro=leer.nextLine();

        System.out.println("Ingrese la editorial del libro");
        editorialLibro=leer.nextLine();
   
    }

    public void consultarLibro(String nameBook){

        if(nombreLibro==nameBook){
            System.out.println("Su editorial es:"+editorialLibro);

        }
    }

    
}
