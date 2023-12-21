// Este é um pacote Java chamado Dia3
package Dia3;

// Classe chamada "operadorTernario"
public class operadorTernario {
    public static void main(String[] args) {
        int ingresso = 600;
        
        // Utiliza o operador ternário para decidir o tipo de acesso com base no valor do ingresso
        String terAcesso = ingresso >= 500 ? "VIP" : "Pista"; // Substitua o ponto e vírgula por dois pontos (:)
        
        // Imprime o resultado do operador ternário
        System.out.println(terAcesso);
    }
}
