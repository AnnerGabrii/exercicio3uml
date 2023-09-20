package domain;

public class Aeroporto {
    private int codigo;
    private String nome;
    private String localizacao;
    private Cidade cidade;

    public Aeroporto(int codigo, String nome, String localizacao, Cidade cidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.localizacao = localizacao;
        this.cidade = cidade;
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

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Aeroporto [codigo=" + codigo + ", nome=" + nome + ", localizacao=" + localizacao + "]";
    }
}
