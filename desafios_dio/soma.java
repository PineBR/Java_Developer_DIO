/*
O código lê dois valores inteiros identificados como variáveis A e B.
Calcula a soma entre elas e chame essa variável de SOMA.
Em seguida escreve o valor desta variável.
*/
import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int A, B, soma;

        A = sc.nextInt();
        B = sc.nextInt();
        soma =  A + B;  

        System.out.println("SOMA = " + soma);
        sc.close();
   }
}
