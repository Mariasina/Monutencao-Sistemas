package Ex2;

public class Funcionario {
    private int cod_func;
    private String nome;
    private float salario;
    private String email;

    Funcionario(int cod_func, String nome, float salario, String email){
        this.cod_func = cod_func;
        this.nome = nome;
        this.salario = salario;
        this.email = email;
    }

    public int getCod_func() {
        return cod_func;
    }

    public void setCod_func(int cod_func) {
        this.cod_func = cod_func;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
