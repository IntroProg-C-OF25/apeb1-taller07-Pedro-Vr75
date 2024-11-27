
import java.util.Scanner;

public class Problema2_Serie2 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int cont, num1, num2;
        cont = 1;
        num1 = 5;
        num2 = 10;
        while (cont <= 6) {
            System.out.println(num1 + "/" + num2);
            num1 = num1 + 5;
            num2 = num2 + 2;
            cont++;
        }

    }

}
/*
run:
5/10
10/12
15/14
20/16
25/18
30/20
BUILD SUCCESSFUL (total time: 0 seconds)
*/