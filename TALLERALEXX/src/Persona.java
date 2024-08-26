import java.util.ArrayList;
import java.util.Scanner;

public class Persona {
    //ArrayList<> listaPersonas = new ArrayList<>();

    public Scanner scanner = new Scanner(System.in);
    private String nombre;
    private String cedula;
    private String email;
    private float estatura;
    private int edad;
    private float peso;

    public Persona (String nombre,String cedula,String email,float estatura,int edad, float peso) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.estatura = estatura;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getEmail() {
        return email;
    }

    public int getEdad() {
        return edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public float getPeso() {
        return peso;
    }

    public  void  agregarPersona (String nombre,String cedula,String email,double estatura,int edad, double peso){
        System.out.println("Ingresa el nombre de la persona :");
        nombre = scanner.nextLine();
        System.out.println("Ingresa la CEDULA de la persona ");
        cedula = scanner.nextLine();
        System.out.println("Ingresa el Correo Electronico  de la persona :");
        email = scanner.nextLine();
        System.out.println("Ingresa la edad  de la persona :");
        edad = scanner.nextInt();
        System.out.println("Ingresa la estatura de la persona :");
        estatura = scanner.nextDouble();
        System.out.println("Ingresa el peso de la persona :");
        peso = scanner.nextDouble();
       //(nombre,cedula,email,edad,estatura,peso);
    }

    //public void agregarPersonas (String nombre,String cedula,String email,double estatura,int edad,double peso){



}


