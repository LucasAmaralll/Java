// Define um pacote chamado Dia5
package Dia5;

// Define uma classe chamada 'debug'
public class debug {
    
    // Método principal (ponto de entrada para o programa)
    public static void main(String[] args) {
        // Imprime uma mensagem
        System.out.println("Listar os numeros pares de 0 a 20");
        
        // Chama o método evenNumbers com argumento 20
        evenNumbers(20);
    }

    // Método 'evenNumbers' que imprime números pares até um determinado limite
    public static void evenNumbers(int numbers) {
        // Itera de 0 até o número fornecido
        for (int i = 0; i <= numbers; i++) {
            // Configura um ponto de interrupção (breakpoint) na próxima linha
            // Pressione F5 para iniciar a depuração ou use a opção de depuração no VS Code
            // Use F10 para avançar para a próxima linha ou F11 para entrar no bloco if
            if (i % 2 == 0) {
                // Coloque o cursor na frente do System.out.print
                // Pressione F9 para configurar um ponto de interrupção (breakpoint)
                // Execute o programa em modo de depuração e pare aqui
                System.out.print(i + " ");
            }
        }
    }
}
