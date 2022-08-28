/*
Este código recebe dois valores inteiros.
Faz a leitura e em seguida calcula o produto entre estes dois valores. 
Atribua esta operação à variável PROD, mostrado de acordo com a mensagem de saída.
*/
import java.util.Scanner;
/*
Scanner é uma classe no pacote java.util usada para
obter a entrada dos tipos int, double, strings ... etc.
*/

public class Mult {
	public static void main(String[] args) {
		//Para obter a instância do java Scanner que lê a entrada
		//precisamos passar o fluxo de entrada (System.in) no construtora da classe Scanner
		Scanner sc = new Scanner(System.in);
		// para criar um objeto da classe Scanner
		// passamos o objeto predefinido System.in - fluxo de entrada padrão
		int A, B, PROD;
		
		A = sc.nextInt();
		B = sc.nextInt();
		//O método nextInt() da classe Java Scanner é usado para varrer 
		//o próximo token da entrada como um int.
		PROD = A * B;  

		System.out.println("PROD = " +  PROD );
		//println() move o cursor para próxima linha após imprimir
		//println é quando deseja o resultado em 2 linhas separadas
		//Os objetos do scanner precisam ser fechados ao fim do método principal.
		sc.close();
	}
}