
import java.util.Scanner;

public class Problema5_Estudiantes {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre, estado;
        double promedio;
        int cont = 1;

        while (cont <= 4) {
            System.out.print("Ingrese el nombre del Estudiante " + cont + ": ");
            nombre = tcl.next();
            System.out.print("Ingrese el promedio del Estudiante " + cont + ": ");
            promedio = tcl.nextDouble();
            cont++;
            if (promedio < 7) {
                estado = "Reprobado";
            } else {
                estado = "Aprobado";
            }

            System.out.printf("| %s | %s | %s |\n", "NOMBRE", "PROMEDIO", "ESTADO");
            System.out.printf("| %s | %.2f \t| %s |\n", nombre, promedio, estado);
        }
    }
}
/*
run:
Ingrese el nombre del Estudiante 1: Juan 
Ingrese el promedio del Estudiante 1: 8
| NOMBRE | PROMEDIO | ESTADO |
| Jhoan  | 8.00     | Aprobado |
Ingrese el nombre del Estudiante 2: Alex
Ingrese el promedio del Estudiante 2: 6
| NOMBRE | PROMEDIO | ESTADO |
| Derek  | 6.00     | Reprobado |
Ingrese el nombre del Estudiante 3: Sergio
Ingrese el promedio del Estudiante 3: 5
| NOMBRE | PROMEDIO | ESTADO |
| Sergio | 5.00     | Reprobado |
Ingrese el nombre del Estudiante 4: Carlos
Ingrese el promedio del Estudiante 4: 9
| NOMBRE | PROMEDIO | ESTADO |
| Carlos | 9.00     | Aprobado |
*/
