package Salud;

import java.util.Scanner;

public class Empleado extends Persona{
    Scanner leer=new Scanner(System.in);
    // Atributos
    private String cargo;
    private int valorHora;
    private int horasTrabajadas;
    private String departamento;
    private double honorarios;

    //Metodos
    public Empleado(){

    }
    public Empleado(String cargo, int valorHora, int horasTrabajadas, String departamento, String tipoDoc, int documento, String nombre, String apellido){
        super(tipoDoc, documento, nombre, apellido);
        this.cargo=cargo;
        this.valorHora=valorHora;
        this.departamento=departamento;
        this.horasTrabajadas=horasTrabajadas;
    }

    public void calcularHonorarios(){
        /*
        System.out.println("Cuantas horas trabajo? ");
        horasTrabajadas=leer.nextInt();
        System.out.println("Cuanto vale la hora? ");
        valorHora=leer.nextInt();
        leer.nextLine();
        System.out.println("En que departamento se ubica? ");
        departamento=leer.nextLine();
        */
        honorarios=(horasTrabajadas*valorHora)-(horasTrabajadas*valorHora*(0.034));
        
        System.out.println(getTipoDoc()+" "+getDocumento()+" de "+getNombre()+" "+getApellido()+" con el cargo de "+cargo+" que laboro "+horasTrabajadas+" Con un valoer de "+valorHora+" cada una, corresponde un pago de "+honorarios);
    }

}
