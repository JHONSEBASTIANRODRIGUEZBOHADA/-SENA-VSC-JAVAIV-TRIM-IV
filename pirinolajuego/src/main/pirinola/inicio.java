import java.util.*;

public class inicio {
    public static void main(String[] args) 
    {
        int eleccion;
        Scanner scanner = new Scanner(System.in);
        juego juego = new juego();
        
        juego.infoJugador();
        
        do 
        {
            juego.jugador1();
            juego.jugador2();

            System.out.println("\nIngrese (0) girar la pirinola. Ingrese (otro numero) si quiere retirarse del juego");
            eleccion = scanner.nextInt();
        } while (eleccion == 0);
        juego.Resultados();
        scanner.close();
    }
}
