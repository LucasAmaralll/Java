// Este é um pacote Java chamado Dia3
package Dia3;

// Importa a classe NumberFormat do pacote java.text para formatar números
import java.text.NumberFormat;

// Classe chamada "formatacaoNumero"
public class formatacaoNumero {
    
    // Método principal, onde a execução do programa começa
    public static void main (String[] args) {
        
        // Obtém uma instância de NumberFormat para formatar valores monetários (No formato da configuração de linguagem da sua máquina)
        NumberFormat pound = NumberFormat.getCurrencyInstance();
        
        // Formata o valor 120.80 como uma string no formato de moeda
        String productValue = pound.format(120.80);
        
        // Imprime o valor formatado
        System.out.println(productValue);
    }
}
