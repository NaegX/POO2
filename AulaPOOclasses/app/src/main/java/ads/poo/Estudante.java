package ads.poo;

public class Estudante {

    private String nome;
    private int matricula;
    private int cpf;
    private static int total =0;

    public Estudante(String nome, int matricula, int cpf) {
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
        total++;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Estudante.total = total;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String toString() {
        return "Nome = " + this.nome + " \n matricula = " + this.matricula + " \n cpf = " + this.cpf + '}';
    }
}
