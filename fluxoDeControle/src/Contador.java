import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
       Scanner terminal = new  Scanner(System.in);
       System.out.print("Digite o primeiro parâmetro => ");
		int parametroUm = terminal.nextInt();
		System.out.print("Digite o segundo parâmetro => ");
		int parametroDois = terminal.nextInt();
        terminal.close();
        
        try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
            System.out.println("O Segundo parâmentro deve ser maior que o primeiro");
			//imprimir a mimport java.io.PrintWriter;ensagem: O segundo parâmetro deve ser maior que o primeiro
		}
		
	}


    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm>parametroDois){
            throw  new ParametrosInvalidosException();
        }
        int contagem = parametroDois-parametroUm;
        for (int i=contagem; i<parametroDois; i++){
            System.out.println("Imprimindo: " + i);
        }
		
		
		//realizar o for para imprimir os números com base na variável contagem
	}
}
