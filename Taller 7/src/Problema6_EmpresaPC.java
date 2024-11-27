
import java.util.Scanner;

public class Problema6_EmpresaPC {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre;
        int cont = 0, tipocliente;
        double costopc, descuento = 0, valor_total;
        while (cont < 7) {
            System.out.println("Venta " + (cont + 1));
            System.out.print("Ingrese el nombre del cliente:  ");
            nombre = tcl.next();
            System.out.print("Ingrese el costo de la computadora: ");
            costopc = tcl.nextDouble();
            tcl.nextLine();
            System.out.print("Ingrese el tipo de cliente: ");
            tipocliente = tcl.nextInt();
            switch (tipocliente) {
                case 1:
                    descuento = costopc * 0.10;
                    break;
                case 2:
                    descuento = costopc * 0.20;
                    break;
                default:
                    descuento = 0;
                    break;
            }

            valor_total = costopc - descuento;

            System.out.println("Cliente: " + nombre + "," + " Cliente Tipo " + tipocliente + "," + " compra computadora con precio: $" + valor_total);
            System.out.println();

            cont++;
        }
    }

}
/*
run:
Venta 1
Ingrese el nombre del cliente:  Juan
Ingrese el costo de la computadora: 500
Ingrese el tipo de cliente: 2
Cliente: Juan, Cliente Tipo 2, compra computadora con precio: $400.0

Venta 2
Ingrese el nombre del cliente:  Ramon
Ingrese el costo de la computadora: 250
Ingrese el tipo de cliente: 1
Cliente: Ramon, Cliente Tipo 1, compra computadora con precio: $225.0

Venta 3
Ingrese el nombre del cliente:  Pablo
Ingrese el costo de la computadora: 800
Ingrese el tipo de cliente: 2
Cliente: Pablo, Cliente Tipo 2, compra computadora con precio: $640.0

Venta 4
Ingrese el nombre del cliente:  Sergio
Ingrese el costo de la computadora: 600
Ingrese el tipo de cliente: 1
Cliente: Sergio, Cliente Tipo 1, compra computadora con precio: $540.0

Venta 5
Ingrese el nombre del cliente:  Emilio
Ingrese el costo de la computadora: 900
Ingrese el tipo de cliente: 2
Cliente: Emilio, Cliente Tipo 2, compra computadora con precio: $720.0

Venta 6
Ingrese el nombre del cliente:  Alex
Ingrese el costo de la computadora: 200
Ingrese el tipo de cliente: 1
Cliente: Alex, Cliente Tipo 1, compra computadora con precio: $180.0

Venta 7
Ingrese el nombre del cliente:  Tadeo
Ingrese el costo de la computadora: 400
Ingrese el tipo de cliente: 5
Cliente: Tadeo, Cliente Tipo 5, compra computadora con precio: $400.0
 */
