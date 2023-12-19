// Este é um pacote Java chamado Dia2
package Dia2;

// Importa a classe Arrays do pacote java.util para utilizar métodos relacionados a arrays
import java.util.Arrays;

// Classe chamada "arrayString"
public class arrayString {
    
    // Método principal, onde a execução do programa começa
    public static void main(String[] args) {
        
        // Declaração e inicialização de um array de strings chamado "cars"
        String[] cars = {"BMW", "Tesla", "Jeep", "Fiat"};
        
        // Altera o valor na posição 2 do array para "Ferrari"
        cars[2] = "Ferrari";
        
        // Imprime os elementos do array utilizando o método toString da classe Arrays
        System.out.println(Arrays.toString(cars));
        
        // Imprime o valor na posição 1 do array (índice 1)
        System.out.println(cars[1]);
    }
}
