// Declaração do pacote ao qual a classe pertence
package Dia6;

// Definição da classe "car"
public class Car {
    
    // Atributos privados da classe
    private String marca;    // Atributo para armazenar a marca do carro
    private String modelo;   // Atributo para armazenar o modelo do carro
    private int ano;         // Atributo para armazenar o ano de fabricação do carro

    // Construtor da classe "car" que recebe informações sobre a marca, modelo e ano
    Car(String marca, String modelo, int ano) {
        // Atribui os valores fornecidos aos atributos da classe
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno () {
        return ano;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
