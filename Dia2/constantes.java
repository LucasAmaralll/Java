// Este é um pacote Java chamado Dia2
package Dia2;

// Classe chamada "constantes"
public class constantes {
    
    // Método principal, onde a execução do programa começa
    public static void main(String[] args) {
        
        // Declaração e inicialização de uma constante (final) chamada "taxaJuros"
        final double taxaJuros = 11.92;
        
        // Imprime o valor da constante "taxaJuros"
        System.out.println(taxaJuros);
        
        // Tentativa de atribuir um novo valor à constante (isso resultará em um erro de compilação)
        // taxaJuros = 11.52; // não funciona por conta da constante (final)
        
        // Imprime novamente o valor da constante (não foi alterado devido à sua natureza constante)
        System.out.println(taxaJuros);
    }
}
