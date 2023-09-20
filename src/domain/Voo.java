package domain;

import java.util.ArrayList;
import java.util.List;

public class Voo {
    private String prefixo;
    private String nome;
    private int limite;
    private Aeroporto origem;
    private Aeroporto destino;
    private List<Passagem> passagens = new ArrayList<>();
    private List<Escala> escalas = new ArrayList<>();

    public Voo(String prefixo, String nome, int limite, Aeroporto origem, Aeroporto destino) {
        this.prefixo = prefixo;
        this.nome = nome;
        this.limite = limite;
        this.origem = origem;
        this.destino = destino;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public Aeroporto getOrigem() {
        return origem;
    }

    public void setOrigem(Aeroporto origem) {
        this.origem = origem;
    }

    public Aeroporto getDestino() {
        return destino;
    }

    public void setDestino(Aeroporto destino) {
        this.destino = destino;
    }

    public List<Passagem> getPassagens() {
        return passagens;
    }

    public void addPassagem(Passagem passagem) {
        passagens.add(passagem);
    }

    public List<Escala> getEscalas() {
        return escalas;
    }

    public void addEscala(Escala escala) {
        escalas.add(escala);
    }

    @Override
    public String toString() {
        return "Voo [prefixo=" + prefixo + ", nome=" + nome + ", limite=" + limite + "]";
    }
}
