/*
 * This source file was generated by the Gradle 'init' task
 */
package ads.poo;

public class App {

    public static void main(String[] args) {

        Carro f = new Carro();

        f.definirVelocidadeAtual(10);
        f.definirCor("azul");
        f.definirModelo("Fusca");

        Carro g = new Carro();

        g.definirVelocidadeAtual(10);
        g.definirCor("azul");
        g.definirModelo("Gol");

        System.out.println(f.obterModelo() + " " + f.obterCor() + " está a " + f.obterVelocidade() + " km/h");

        System.out.println(g.obterModelo() + " " + g.obterCor() + " está a " + g.obterVelocidade() + " km/h");

    }
}