// Este é um pacote Java chamado Dia2
package Dia2;

// Classe chamada "convertendoStrings"
public class convertendoStrings {
    
    // Método principal, onde a execução do programa começa
    public static void main(String[] args) {
        
        // String que representa o valor do produto
        String valorProduto = "10";
        
        // Converte a string "valorProduto" para um número inteiro e adiciona 2
        int valorTotal = Integer.parseInt(valorProduto) + 2;
        
        // Imprime a string "valorProduto"
        System.out.println(valorProduto);
        
        // Imprime o valor total (convertido de string para inteiro)
        System.out.println(valorTotal);
    }
}
