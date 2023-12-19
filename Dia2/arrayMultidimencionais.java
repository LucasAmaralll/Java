// Este é um pacote Java chamado Dia2
package Dia2;

// Importa a classe Arrays do pacote java.util para utilizar métodos relacionados a arrays
import java.util.Arrays;

// Classe chamada "arrayMultidimencionais"
public class arrayMultidimencionais {
    
    // Método principal, onde a execução do programa começa
    public static void main(String[] args) {
        
        // Declaração e inicialização de um array multidimensional de strings chamado "cars"
        String[][] cars = {{"BMW", "Tesla"}, {"Jeep", "Fiat"}};
        
        // Imprime os elementos do array multidimensional utilizando o método deepToString da classe Arrays
        System.out.println(Arrays.deepToString(cars));
    }
}
