// Este é um pacote Java chamado Dia3
package Dia3;

// Classe chamada "operadorAnd"
public class operadorAnd {
    
    // Método principal, onde a execução do programa começa
    public static void main(String[] args) {
        
        // priceProduct = $20
        // Comprar somente entre $10 e $15
        
        // Declaração e inicialização da variável priceProduct
        int priceProduct = 20;
        
        // Utiliza o operador lógico && (AND) para verificar se o preço do produto está entre $10 e $15
        boolean buy = priceProduct >= 10 && priceProduct <= 15;
        
        // Imprime o resultado da condição lógica
        System.out.println(buy);
    }
}
