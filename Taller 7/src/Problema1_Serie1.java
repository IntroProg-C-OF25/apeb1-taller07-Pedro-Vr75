
import java.util.Scanner;

public class Problema1_Serie1 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int cont = 0, limite;
        System.out.print("Ingrese un limite: ");
        limite = tcl.nextInt();
        while (cont <= limite) {
            System.out.println(cont + "/" + (cont + 9));
            cont++;
        }
    }
}
/*
run:
Ingrese un limite: 6
0/9
1/10
2/11
3/12
4/13
5/14
6/15
BUILD SUCCESSFUL (total time: 2 seconds)
*/