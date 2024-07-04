package Ex3;

public class Imovel {
    private int cadastro;
    private float iptu;
    private int meses_atrasado;
    private float multa;

    Imovel(int cadastro, float iptu, int meses_atrasado, float multa){
        this.cadastro = cadastro;
        this.iptu = iptu;
        this.meses_atrasado = meses_atrasado;
        this.multa = multa;
    }

    public int getCadastro() {
        return cadastro;
    }
    public void setCadastro(int cadastro) {
        this.cadastro = cadastro;
    }
    public float getIptu() {
        return iptu;
    }
    public void setIptu(float iptu) {
        this.iptu = iptu;
    }
    public int getMeses_atrasado() {
        return meses_atrasado;
    }
    public void setMeses_atrasado(int meses_atrasado) {
        this.meses_atrasado = meses_atrasado;
    }
    public float getMulta() {
        return multa;
    }
    public void setMulta(float multa) {
        this.multa = multa;
    }

    
}
