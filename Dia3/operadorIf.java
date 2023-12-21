// Este é um pacote Java chamado Dia3
package Dia3;

// Classe chamada "operadorIf"
public class operadorIf {
    
    // Método principal, onde a execução do programa começa
    public static void main(String[] args) {
        
        // Declaração e inicialização da variável "valorCarro" com o valor 100.000
        int valorCarro = 100_000;
        
        // Estrutura condicional "if-else if-else" para determinar se comprar o carro
        if (valorCarro > 100_000)
            System.out.println("Não comprar, acima da tabela"); // Se o valor do carro for acima de 100.000
        else if (valorCarro >= 90_000 && valorCarro <= 100_000) // Se o valor estiver entre 90.000 e 100.000
            System.out.println("Comprar o carro");
        else
            System.out.println("Não comprar, valor abaixo da tabela"); // Se o valor do carro for abaixo de 90.000
    }
}
