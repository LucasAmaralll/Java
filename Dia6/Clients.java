// Classe que representa clientes
// Contém atributos como "firstName" (primeiro nome), "age" (idade) e "balance" (saldo)
// O saldo é inicializado como $10 no construtor da classe
// Possui o método "newAccount" que exibe uma mensagem indicando a criação de uma nova conta, 
// incluindo o saldo atualizado
package Dia6;

public class Clients {
    // Atributos da classe
    String firstName;
    int age;
    int balance;

    // Construtor da classe que inicializa o saldo como $10
    Clients() {
        balance = 10;
    }

    // Método para criar uma nova conta
    void newAccount() {
        System.out.println(firstName + " Account Created!");
        System.out.println("The new balance is $" + balance);
    }
}
