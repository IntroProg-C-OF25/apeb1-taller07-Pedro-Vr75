
import java.util.Scanner;

public class Problema3_Empleados {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double salario, costodia;
        int dias, cont = 1, limite;
        String nombre;
        System.out.print("Ingrese el limite de empleados: ");
        limite = tcl.nextInt();
        while (cont <= limite) {
            System.out.print("Ingrese el Nombre: ");
            nombre = tcl.next();
            System.out.print("Ingrese el numero de dias: ");
            dias = tcl.nextInt();
            System.out.print("Ingrese el costo por dia: ");
            costodia = tcl.nextDouble();
            salario = dias * costodia;
            System.out.printf("|\t%s\t | %s | %s | %s | \n", "NOMBRE", "DIAS", "COSTO DIA", "SALARIO");
            System.out.printf("|\t%s\t |  %2d  |   %.2f    |  %.2f  | \n", nombre, dias, costodia, salario);
            cont++;
        }
    }
}
/*
run:
Ingrese el limite de empleados: 5
Ingrese el Nombre: Pablo
Ingrese el numero de dias: 5
Ingrese el costo por dia: 3.5
|	NOMBRE	 | DIAS | COSTO DIA | SALARIO | 
|	Pablo	 |   5  |   3.50    |  17.50  | 
*/
