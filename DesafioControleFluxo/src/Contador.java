import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scanner.nextInt();

        try {
            System.out.println("Dados de entrada:" + parametroUm);  
            System.out.println("Primeiro parâmetro = " + parametroUm); 
            System.out.println("Segundo parâmetro = " + parametroDois);  
            System.out.println("----------------------");  

            contar(parametroUm, parametroDois);
            
        } catch (ParametrosInvalidosException exception) {

            System.out.println("Erro: Para proseguir com a aplicação desejada, o segundo parâmetro deve ser maior que o primeiro!");
        }
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		
        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

		int contagem = parametroDois - parametroUm;
        
        for(contagem = parametroUm+1; contagem < parametroDois; contagem++) {
            System.out.println("Imprimindo o número " + contagem);
        }
	}
}