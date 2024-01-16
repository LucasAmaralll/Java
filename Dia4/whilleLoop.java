package Dia4;

public class whilleLoop {
    public static void main(String[] args) {
        // Inicializando a variável de controle do loop
        int i = 0;
        
        // Executando o loop enquanto a condição i < 5 for verdadeira
        while (i < 5) {
            // Imprimindo o valor de i e uma mensagem
            System.out.println(i + " - Hi");
            
            // Incrementando a variável de controle para evitar um loop infinito
            i++;
        }   
    }
}
