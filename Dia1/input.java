package Dia1;
// Importa a classe Scanner do pacote java.util para leitura de entrada do usuário
import java.util.Scanner;

// Definição da classe chamada "input"
public class input {
    // Método principal
    public static void main(String[] args) {
        // Criação de um objeto Scanner para capturar a entrada do usuário
        Scanner idadeScanner = new Scanner(System.in);
        
        // Solicita ao usuário que digite a sua idade
        System.out.println("Digite a sua idade: ");
        
        // Lê o próximo byte da entrada do usuário e armazena na variável idadeCliente
        byte idadeCliente = idadeScanner.nextByte();
        
        // Imprime a idade informada pelo usuário
        System.out.println(idadeCliente);
        
        // Fecha o Scanner para liberar recursos
        idadeScanner.close();
    }
}
