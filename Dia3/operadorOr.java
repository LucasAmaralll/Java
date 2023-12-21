// Este é um pacote Java chamado Dia3
package Dia3;

// Classe chamada "operadorOr"
public class operadorOr {
    
    // Método principal, onde a execução do programa começa
    public static void main(String[] args) {
        
        // Declaração e inicialização de variáveis booleanas
        boolean temEmprego = false;
        boolean temEmpresa = true;
        boolean tem50k = true;
        
        // Utiliza o operador lógico || (OR) para verificar se a pessoa tem emprego OU empresa
        // e o operador && (AND) para verificar se ela também tem $50,000
        boolean podeFinanciar = (temEmprego || temEmpresa) && tem50k;
        
        // Imprime o resultado da condição lógica
        System.out.println(podeFinanciar);
    }
}
