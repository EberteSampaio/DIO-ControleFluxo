import java.util.Scanner;

import example.exceptions.ParametrosInvalidosException;

public class Contador {
	public static void main(String[] args) throws Exception {

		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		
		try {

			if(parametroDois <= 0 || parametroUm <=0){
				terminal.close();
				throw new Exception("Não é possível valores menores ou iguais a zero");
			}

			

			contar(parametroUm, parametroDois);
			
			terminal.close();

		}catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
		}catch(Exception exception){
			System.out.println(exception.getMessage());
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		
		int contagem = parametroDois - parametroUm;

		if(parametroDois < parametroUm){
			throw new ParametrosInvalidosException();
		}

		
		for(int i = 0; i < contagem; i++){
			System.out.println("Imprimindo o número "+ (i + 1));
		}
	}
}