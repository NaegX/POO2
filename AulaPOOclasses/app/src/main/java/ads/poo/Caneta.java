package ads.poo;

public class Caneta {
   private String cor;
   private int nivelTinta;

    public Caneta(String cor, int nivelTinta) {
        this.cor = cor;
        this.nivelTinta = nivelTinta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNivelTinta() {
        return nivelTinta;
    }

    public void setNivelTinta(int nivelTinta) {
        this.nivelTinta = nivelTinta;
    }

    public String desenhar(int distancia){
        if(distancia <=0 ){
            return  "Distância incorreta";
        }
        if (nivelTinta < distancia ){
            return "Não é possivel desenhar , nivel de tinta insuficiente";
        }else{
            nivelTinta = nivelTinta - distancia;
            return "Desenhando " + distancia + " cm na cor " + cor + ", e ainda possui " + nivelTinta + " % de tinta" ;
        }
    }



    @Override
    public String toString() {
        return "Caneta : " + "cor = " + cor + ", nivelTinta = " + nivelTinta ;
    }
}
