public class Contador {
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
