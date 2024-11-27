
public class Problema7_Serie7 {

    public static void main(String[] args) {
        int num = 10, cont=1; // Número de términos en la serie
        String lista = "sumatoria = ";

        for ( cont = 1; cont <= num; cont++) {
            if (cont % 2 == 0) {
                lista += "+(1/" + cont + ")";
            } else {
                lista += "-(1/" + cont + ")";
            }
        }

        System.out.println(lista);
    }
}
/*
run:
sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
BUILD SUCCESSFUL (total time: 0 seconds)

*/