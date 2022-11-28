package Salud;

import java.lang.Math;
import java.util.Scanner;

public class Persona {

    Scanner leer=new Scanner(System.in);
    // Atributos
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private int peso;
    private double estatura;
    private int edad;
    private String sexo;


    // Metodos cosntructores.................................................
    public Persona(){
    }
    public Persona(String tipoDoc, int documento, String nombre, String apellido) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Persona( String tipoDoc, int documento, String nombre, String apellido, int peso, double estatura, int edad, String sexo){
        this.tipoDoc=tipoDoc;
        this.documento=documento;
        this.nombre=nombre;
        this.apellido=apellido;
        this.peso=peso;
        this.estatura=estatura;
        this.edad=edad;
        this.sexo=sexo;   
    }
    
    public void mostrarPersona(String tipoDoc, int documento, String nombre,    String apellido, int peso, double estatura, int edad, String sexo) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.sexo = sexo;
        System.out.println("Tipo de documento: "+tipoDoc);
        System.out.println("Documento: "+documento);
        System.out.println("Nombres y apellido: "+nombre+" "+apellido);
        System.out.println("Peso: "+peso);
        System.out.println("Estatura: "+estatura);
        System.out.println("Edad: "+edad);
        System.out.println("Sexo: "+sexo);
    }
    public void mostrarPersona(){
        System.out.println("Tipo de documento: "+tipoDoc);
        System.out.println("Documento: "+documento);
        System.out.println("Nombres y apellido: "+nombre+" "+apellido);
        System.out.println("Peso: "+peso);
        System.out.println("Estatura: "+estatura);
        System.out.println("Edad: "+edad);
        System.out.println("Sexo: "+sexo);
    }

    //Metodos accesores....................................................
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //Metodos propios o personalizados......................................
    public void pedirDatos(){

        System.out.println("Tipo de documento?");
        tipoDoc=leer.nextLine();
        System.out.println("Documento?");
        documento=leer.nextInt();
        leer.nextLine();//Limpieza buffer
        System.out.println("Ingrese nombre");
        nombre=leer.nextLine();
        System.out.println("Ingrese apellido");
        apellido=leer.nextLine();
        System.out.println("Peso:");
        peso=leer.nextInt();
        System.out.println("Estatura:");
        estatura=leer.nextDouble();
        System.out.println("Edad:");
        edad=leer.nextInt();
        leer.nextLine();//Limpieza buffer
        System.out.println("Ingrese sexo");
        sexo=leer.nextLine();
        
    }

    public double calcularIMC(int peso, double estatura){
        double pesoActual=peso/(Math.pow(estatura, 2));
        /*
        if(pesoActual<20){
            System.out.println("El peso esta por debajo de lo ideal "+pesoActual);
        }
        else if(pesoActual<=25 && pesoActual>=20) {
            System.out.println("El peso es ideal "+pesoActual);
        }
        else{
            System.out.println("Tiene sobre peso "+pesoActual);
        }
        */ 
        return pesoActual;
    }

    public void mayorEdad(){

        if(edad>=18){
            System.out.println("Es mayor de edad");
        }
        else{
            System.out.println("Es menor de edad");
        }
    }
        
}
