package ads.poo;

public class Carro {

    //atributos
    private String modelo;
    private String cor;
    private int velocidadeAtual;


    //métodos

    public void definirVelocidadeAtual(int v){
        velocidadeAtual = v;
    }

    public int obterVelocidade(){
        return velocidadeAtual;


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
