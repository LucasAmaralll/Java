// Classe que representa clientes
// Contém atributos como "firstName" (primeiro nome) e "age" (idade)
// Possui o método "newAccount" que exibe uma mensagem indicando a criação de uma nova conta
package Dia6;

public class Clients {
    // Atributos da classe
    String firstName;
    int age;

    // Método para criar uma nova conta
    void newAccount() {
        System.out.println(firstName + " Account Created!");
        System.out.println("The new balance is $10");
    }
}
