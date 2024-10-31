package ads.poo;

public class Carro {

    //atributos
    private String modelo;
    private String cor;
    private int velocidadeAtual;
    private int velocidadeMaxima;

    public Carro(String modelo, String cor, int velocidadeAtual, int velocidadeMaxima) {
        this.modelo = modelo;
        this.cor = cor;
        this.velocidadeAtual = 0;
        this.velocidadeMaxima = velocidadeMaxima;
        this.acelerar(velocidadeAtual);
    }


    //métodos

    public void acelerar (int v){
        this.velocidadeAtual = Math.max(Math.min(velocidadeMaxima,this.velocidadeAtual),0);
    }



    public void definirModelo(String m){
        modelo = m;
    }

    public String obterModelo(){
        return modelo;
    }


    public void definirCor(String c){
        cor = c;
    }

    public String obterCor(){
        return cor;
    }




}
