package Ex13;

public class Estagiario {
    private int cod;
    private String nome;
    private int ano;
    private float salario[] = new float[12];
    private float salario_anual;

    public Estagiario(int cod, String nome, int ano){
        this.cod = cod;
        this.nome = nome;
        this.ano = ano;
        
    }

    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public float[] getSalario() {
        return salario;
    }
    public void setSalario(float salario_ind, int index) {
        salario[index] = salario_ind;
    }
    public float getSalario_anual() {
        return salario_anual;
    }
    public void setSalario_anual(float salario_anual) {
        this.salario_anual = salario_anual;
    }

    
}
