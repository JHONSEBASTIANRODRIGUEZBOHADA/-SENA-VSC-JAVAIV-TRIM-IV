import java.util.*;

public class jugador {
    private String nombre1,nombre2;
    private int edad1,edad2;
    private double dineroApostar, totalmesa = 1000, dineroJugador1, dineroJugador2;

    Scanner scanner = new Scanner(System.in);

    
    public jugador() {}

    public jugador(String nombre1, String nombre2, int edad1, int edad2) {
        this.nombre1 = nombre1;
        this.edad1 = edad1;
        this.nombre2 = nombre2;
        this.edad2 = edad2;
    }


    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public int getEdad1() {
        return edad1;
    }

    public void setEdad1(int edad1) {
        this.edad1 = edad1;
    }

    public int getEdad2() {
        return edad2;
    }

    public void setEdad2(int edad2) {
        this.edad2 = edad2;
    }

    public double getDineroApostar() {
        return dineroApostar;
    }

    public void setDineroApostar(double dineroApostar) {
        this.dineroApostar = dineroApostar;
    }

    public double getTotalmesa() {
        return totalmesa;
    }

    public void setTotalmesa(double totalmesa) {
        this.totalmesa = totalmesa;
    }
    
    public double getDineroJugador1() {
        return dineroJugador1;
    }

    public void setDineroJugador1(double dineroJugador1) {
        this.dineroJugador1 = dineroJugador1;
    }

    public double getDineroJugador2() {
        return dineroJugador2;
    }

    public void setDineroJugador2(double dineroJugador2) {
        this.dineroJugador2 = dineroJugador2;
    }


    public void infoJugador() 
    {
        System.out.println("\nBIENVENIDO AL JUEGO DE LA PIRINOLA");

        System.out.println("\nIngrese el nombre del jugador1");
        nombre1 = scanner.next();
        System.out.println("Ingrese su edad");
        edad1 = scanner.nextInt();
        System.out.println("\nIngrese el nombre del jugador2");
        nombre2 = scanner.next();
        System.out.println("Ingrese su edad");
        edad2 = scanner.nextInt();
        System.out.println("Ingrese la cantidad de dinero con la que van a estar apostando");
        dineroApostar = scanner.nextDouble();
    }
}
