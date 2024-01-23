package Dia6;

public class Desafio6Car {
    
    public String marca; 
    public String modelo;
    public int ano;
    public int valor;

    Desafio6Car(String marca, String modelo, int ano, int valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }

    public double valorVenda (){
        double ValorFinal = (valor * 0.1) + valor;
        return ValorFinal;
    }

}
