
import java.util.Scanner;

public class Problema4_NombreJugador {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String lista = "Listado de jugadores\n";
        String nombre, posicion, respuesta;
        double estatura, sumaedad = 0, sumaestatura = 0, promedad, promestatura;
        int edad, contador = 1;
        boolean otro = true;

        while (otro) {
            System.out.print("Ingrese el nombre: ");
            nombre = tcl.nextLine();
            System.out.print("Ingrese la posicion en el campo: ");
            posicion = tcl.nextLine();
            System.out.print("Ingrese la edad del jugador: ");
            edad = tcl.nextInt();
            System.out.print("INgrese la altura del jugador en metros: ");
            estatura = tcl.nextDouble();
            tcl.nextLine();

            sumaedad += edad;
            sumaestatura += estatura;
            lista += (String.format("%d. %s -%s-, edad %d, estatura %.2f\n",
                    contador, nombre, posicion, edad, estatura));

            System.out.print("Desea ingresar mas jugadores? (si/no): ");
            respuesta = tcl.nextLine();
            otro = respuesta.equalsIgnoreCase("si");
            if (otro == false) {
                break;
            }
            contador++;
        }
        promedad = (sumaedad / contador);
        promestatura = (sumaestatura / contador);
        System.out.print(lista);
        System.out.printf("Promedio de edades: %.2f\n", promedad);
        System.out.printf("Promedio de estaturas: %.2f\n", promestatura);
    }
}
/*
run:
Ingrese el nombre: Iker Casillas
Ingrese la posicion en el campo: Portero
Ingrese la edad del jugador: 40
INgrese la altura del jugador en metros: 1.80
Desea ingresar mas jugadores? (si/no): si
Ingrese el nombre: Enner Valencia
Ingrese la posicion en el campo: Delantero
Ingrese la edad del jugador: 32
INgrese la altura del jugador en metros: 1.75
Desea ingresar mas jugadores? (si/no): si
Ingrese el nombre: Antonio Valencia
Ingrese la posicion en el campo: Defensa
Ingrese la edad del jugador: 36
INgrese la altura del jugador en metros: 1.82
Desea ingresar mas jugadores? (si/no): si
Ingrese el nombre: Xavi Hernandez
Ingrese la posicion en el campo: Mediocampista
Ingrese la edad del jugador: 35
INgrese la altura del jugador en metros: 1.77
Desea ingresar mas jugadores? (si/no): si
Ingrese el nombre: Zinedine Zidane
Ingrese la posicion en el campo: Mediocampista
Ingrese la edad del jugador: 25
INgrese la altura del jugador en metros: 1.74
Desea ingresar mas jugadores? (si/no): no
Listado de jugadores
1. Iker Casillas -Portero-, edad 40, estatura 1.80
2. Enner Valencia -Delantero-, edad 32, estatura 1.75
3. Antonio Valencia -Defensa-, edad 36, estatura 1.82
4. Xavi Hernandez -Mediocampista-, edad 35, estatura 1.77
5. Zinedine Zidane -Mediocampista-, edad 25, estatura 1.74
Promedio de edades: 33.60
Promedio de estaturas: 1.78
BUILD SUCCESSFUL (total time: 2 minutes 56 seconds)
*/
