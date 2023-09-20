package domain;
public class Cidade {
    private int codigo;
    private String nome;
    private String populacao;

    public Cidade(int codigo, String nome, String populacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.populacao = populacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPopulacao() {
        return populacao;
    }

    public void setPopulacao(String populacao) {
        this.populacao = populacao;
    }

    @Override
    public String toString() {
        return "Cidade [codigo=" + codigo + ", nome=" + nome + ", populacao=" + populacao + "]";
    }
}
