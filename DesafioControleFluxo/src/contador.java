import java.util.Scanner;

public class contador {
    public static void main(String[] args) {
        // Usando o try-with-resources para garantir que o Scanner seja fechado automaticamente
        try (Scanner terminal = new Scanner(System.in)) {
            
            System.out.println("Digite o primeiro parâmetro:");
            int parametroUm = terminal.nextInt();
            
            System.out.println("Digite o segundo parâmetro:");
            int parametroDois = terminal.nextInt();
            
            contar(parametroUm, parametroDois);
        
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
    
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se o primeiro parâmetro é maior que o segundo
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}


