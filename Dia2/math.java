// Este é um pacote Java chamado Dia2
package Dia2;

// Classe chamada "math"
public class math {
    
    // Método principal, onde a execução do programa começa
    public static void main(String[] args) {
        
        // Arredonda o valor para o número inteiro mais próximo
        double value = Math.round(10.5);
        
        // Arredonda para cima (ceiling) o valor decimal
        double valor = Math.ceil(10.7);
        
        // Arredonda para baixo (floor) o valor decimal
        double valur = Math.floor(10.7);
        
        // Gera um número aleatório entre 0.0 (inclusive) e 1.0 (exclusive)
        double valo = Math.random();
        
        // Gera um número aleatório entre 0.0 (inclusive) e 1.0 (exclusive), multiplicado por 100
        double valu = Math.random() * 100;
        
        // Arredonda o valor resultante da multiplicação
        double randomRedondo = Math.round(valu);
        
        // Converte o valor arredondado para um número inteiro
        int redondoInteiro = (int) Math.round(valu);
        
        // Imprime os resultados de cada operação
        System.out.println(value);
        System.out.println(valor);
        System.out.println(valur);
        System.out.println(valo);
        System.out.println(valu);
        System.out.println(randomRedondo);
        System.out.println(redondoInteiro);
    }
}
