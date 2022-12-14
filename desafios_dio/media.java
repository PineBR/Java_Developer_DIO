/*
Este código lê 2 valores de ponto flutuante de dupla precisão A e B,
que correspondem a 2 notas de um aluno. Em seguida, calcule a média do aluno, 
sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 
(A soma dos pesos portanto é 11). 
Assumindo que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
*/
import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, media;

        A = sc.nextDouble();
        B = sc.nextDouble();

        media = ( A* 3.5 +  B* 7.5)/11; 

        System.out.printf("MEDIA = %.2f", media);
        System.out.println();
        sc.close();
    }    
}
