/*
====== ENTRADA E SAÍDA LENDO E PULANDO NOMES ======
Este programa tem as seguintes características:
1-Ler 10 nomes, sem espaço em branco;
2-Imprime o terceiro nome da lista;
3-Imprime o sétimo nome da lista;
4-Imprime o nono nome da lista.
*/

import java.util.Scanner;

public class pulanomes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nomes = new String[10];
		
		for(int i=0 ; i<10 ; i++){
			nomes[i] = sc.nextLine();
            // também funciona o código abaixo
            //System.out.printf("%s\n%s\n%s\n",nomes[2],nomes[6],nomes[8]);
            if(i == 2 || i == 6 || i == 8){
                System.out.println(nomes[i]);
                sc.close();
            }
        }
	}
}
