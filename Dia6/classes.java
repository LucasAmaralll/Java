// Classe principal que contém o método main
// É responsável por criar instâncias da classe "Clients" e realizar operações com elas
package Dia6;

public class classes {
    public static void main(String[] args) {
        
        // Criando uma instância da classe "Clients" chamada c001
        Clients c001 = new Clients();
        c001.firstName = "Lucas";
        c001.age = 22;

        // Criando outra instância da classe "Clients" chamada c002
        Clients c002 = new Clients();
        c002.firstName = "Victoria";
        c002.age = 21;

        // Chamando o método "newAccount" da instância c002 da classe "Clients"
        c002.newAccount();
    }
}
