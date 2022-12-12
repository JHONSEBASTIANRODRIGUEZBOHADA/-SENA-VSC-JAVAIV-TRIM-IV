import java.util.*;

public class juego extends jugador
{
    int jugador2, jugador1;
    
    Scanner scanner = new Scanner(System.in);

    public void jugador1() 
    {
        if(getEdad1() >= 18 && getEdad2() >= 18)
        {
            System.out.println("\nTURNO DE " + getNombre1());

            jugador1 =  (int)(Math.random()*6+1);

            System.out.println("\nBIENVENIDO: " + getNombre1() + " SU OPONENTE ES: " + getNombre2());
            System.out.println("Dinero total en la mesa: " + getTotalmesa() + " pesos colombianos");
            
            System.out.println("\nLA PIRINOLA ESTA GIRANDO...");

            switch(jugador1)
            {
                case 1:

                    System.out.println("\nEL RESULTADO ES => TODOS PONEN \nRECURDE: estan jugando de a " + getDineroApostar() + " pesos");
                    
                    System.out.println("\n" + getNombre1() + ", ingrese el dinero en pesos colombianos");
                    setTotalmesa(scanner.nextDouble() + getTotalmesa());

                    System.out.println("\n" + getNombre2() + ", ingrese el dinero en pesos colombianos");
                    setTotalmesa(scanner.nextDouble() + getTotalmesa());

                    System.out.println("Dinero total en la mesa: " + getTotalmesa() + " pesos");
                break;

                case 2:
                    System.out.println("\nEL RESULTADO ES => PON DOS \nRECURDE: estan jugando de a " + getDineroApostar() + " pesos");

                    System.out.println("\n" + getNombre1() + ", ingrese el dinero en pesos colombianos");
                    setTotalmesa(scanner.nextDouble() + getTotalmesa());

                    System.out.println("Dinero total en la mesa: " + getTotalmesa() + " pesos");
                break;

                case 3:
                    System.out.println("\nEL RESULTADO ES => PON UNA \nRECURDE: estan jugando de a " + getDineroApostar() + " pesos");

                    System.out.println("\n" + getNombre1() + ", ingrese el dinero en pesos colombianos");
                    setTotalmesa(scanner.nextDouble() + getTotalmesa());

                    System.out.println("Dinero total en la mesa: " + getTotalmesa() + " pesos");
                break;

                case 4:
                    System.out.println("\nEL RESULTADO ES => TOMA TODO");

                    System.out.println("ENHORABUENA " + getNombre1() + " ganaste todo el dinero que hay en la mesa");
                    setDineroJugador1(getTotalmesa());

                    System.out.println("Dinero total que gano son: " + getTotalmesa() + " pesos");
                break;

                case 5:
                    System.out.println("\nEL RESULTADO ES => TOMA DOS");

                    setDineroJugador1(getDineroApostar() * 2);
                    setTotalmesa(getTotalmesa() - getDineroApostar() * 2);

                    System.out.println("Dinero total que gano son: " + getDineroJugador1() + " pesos");
                    System.out.println("Dinero total en la mesa: " + getTotalmesa() + " pesos");
                break;

                case 6:
                    System.out.println("\nEL RESULTADO ES => TOMA UNA");

                    setDineroJugador1(getDineroApostar());
                    setTotalmesa(getTotalmesa() - getDineroApostar());

                    System.out.println("Dinero total que gano son: " + getDineroJugador1() + " pesos");
                    System.out.println("Dinero total en la mesa: " + getTotalmesa() + " pesos");
                break;

                default:
                    System.out.println("Ocurrio un error");
                break;
            }
        }
        else
        {
            System.out.println("No es mayor de edad uno o los dos jugadores");
        }
    }


    public void jugador2() 
    {
        if(getEdad1() >= 18 && getEdad2() >= 18)
        {
            System.out.println("\nTURNO DE " + getNombre2());

            jugador2 =  (int)(Math.random()*6+1);

            System.out.println("\nLA PIRINOLA ESTA GIRANDO...");

            switch(jugador2)
            {
                case 1:
                    System.out.println("\nEL RESULTADO ES => TODOS PONEN \nRECURDE: estan jugando de a " + getDineroApostar() + " pesos");
                    
                    System.out.println("\n" + getNombre1() + ", ingrese el dinero en pesos colombianos");
                    setTotalmesa(scanner.nextDouble() + getTotalmesa());

                    System.out.println("\n" + getNombre2() + ", ingrese el dinero en pesos colombianos");
                    setTotalmesa(scanner.nextDouble() + getTotalmesa());

                    System.out.println("Dinero total en la mesa: " + getTotalmesa() + " pesos");
                break;

                case 2:
                    System.out.println("\nEL RESULTADO ES => PON DOS \nRECURDE: estan jugando de a " + getDineroApostar() + " pesos");

                    System.out.println("\n" + getNombre2() + ", ingrese el dinero en pesos colombianos");
                    setTotalmesa(scanner.nextDouble() + getTotalmesa());

                    System.out.println("Dinero total en la mesa: " + getTotalmesa() + " pesos");
                break;

                case 3:
                    System.out.println("\nEL RESULTADO ES => PON UNA \nRECURDE: estan jugando de a " + getDineroApostar() + " pesos");

                    System.out.println("\n" + getNombre2() + ", ingrese el dinero en pesos colombianos");
                    setTotalmesa(scanner.nextDouble() + getTotalmesa());

                    System.out.println("Dinero total en la mesa: " + getTotalmesa() + " pesos");
                break;

                case 4:
                    System.out.println("\nEL RESULTADO ES => TOMA TODO");

                    System.out.println("ENHORABUENA " + getNombre2() + " ganaste todo el dinero que hay en la mesa");
                    setDineroJugador2(getTotalmesa());

                    System.out.println("Dinero total que gano son: " + getTotalmesa() + " pesos");
                break;

                case 5:
                    System.out.println("\nEL RESULTADO ES => TOMA DOS");

                    setDineroJugador2(getDineroApostar() * 2);
                    setTotalmesa(getTotalmesa() - getDineroApostar() * 2);

                    System.out.println("Dinero total que gano son: " + getDineroJugador2() + " pesos");
                    System.out.println("Dinero total en la mesa: " + getTotalmesa() + " pesos");
                break;

                case 6:
                    System.out.println("\nEL RESULTADO ES => TOMA UNA");

                    setDineroJugador2(getDineroApostar());
                    setTotalmesa(getTotalmesa() - getDineroApostar());

                    System.out.println("Dinero total que gano son: " + getDineroJugador2() + " pesos");
                    System.out.println("Dinero total en la mesa: " + getTotalmesa() + " pesos");
                break;

                default:
                    System.out.println("Ocurrio un error");
                break;
            }
        }
        else
        {
            System.out.println("No es mayor de edad uno o los dos jugadores");
        }
    }

    public void Resultados()
    {
        System.out.println("\nRESULTADOS DE OPERACIONES");

        System.out.println("\n" + getNombre1() + " gano: " + getDineroJugador1());
        System.out.println("\n" + getNombre2() + " gano: " + getDineroJugador2());
    }
}
