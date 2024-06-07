import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try{
            contar(parametroUm, parametroDois);    
        }catch(ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

	static void contar (Integer parametroUm, Integer parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }
        
        Integer contagem = parametroDois - parametroUm;
        Integer totalDeContagem = null;

        for(int i=1; i <= contagem; i++ ) {
            System.out.println("Imprimindo o numero " + i);
            totalDeContagem = i;
        }
        System.out.println("Total de ocorências " + totalDeContagem);
    }    
}
