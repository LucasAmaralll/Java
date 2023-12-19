// Este é um pacote Java chamado Dia2
package Dia2;

// Importa a classe Arrays do pacote java.util para utilizar métodos relacionados a arrays
import java.util.Arrays;

// Classe chamada "array"
public class array {
    
    // Método principal, onde a execução do programa começa
    public static void main(String[] args) {
        
        // Declaração e inicialização de um array de inteiros chamado "valores"
        int[] valores = {10, 20, 15, 30, 40};
        
        // Utiliza o método sort da classe Arrays para ordenar os elementos do array em ordem crescente
        Arrays.sort(valores);
        
        // Imprime os elementos ordenados do array utilizando o método toString da classe Arrays
        System.out.println(Arrays.toString(valores));
        
        // Imprime o comprimento (número de elementos) do array
        System.out.println(valores.length);
    }
}
